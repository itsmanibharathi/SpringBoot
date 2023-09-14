package com.example.demo_jdbc.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo_jdbc.Entity.DemoEntity;
import com.example.demo_jdbc.Service.DemoService;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/all")
    public List<DemoEntity> getAll() {
        return demoService.getAll();
    }

    @GetMapping("/{id}")
    public DemoEntity getById(@PathVariable Long id) {
        return demoService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody DemoEntity entity) {
        demoService.create(entity);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody DemoEntity entity) {
        entity.setId(id);
        demoService.update(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        demoService.delete(id);
    }
}
