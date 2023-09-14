package com.example.demo_jdbc.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.example.demo_jdbc.Entity.DemoEntity;

import java.util.List;

@Service
public class DemoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<DemoEntity> getAll() {
        String sql = "SELECT * FROM demo_entity";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(DemoEntity.class));
    }

    public DemoEntity getById(Long id) {
        String sql = "SELECT * FROM demo_entity WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<>(DemoEntity.class));
    }

    public void create(DemoEntity entity) {
        String sql = "INSERT INTO demo_entity (id, name) VALUES (?, ?)";
        jdbcTemplate.update(sql, entity.getId(), entity.getName());
    }

    public void update(DemoEntity entity) {
        String sql = "UPDATE demo_entity SET name = ? WHERE id = ?";
        jdbcTemplate.update(sql, entity.getName(), entity.getId());
    }

    public void delete(Long id) {
        String sql = "DELETE FROM demo_entity WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }
}
