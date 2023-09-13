package com.example.demo.controller;
import com.example.demo.model.DemoEntity;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {
    private final DemoRepository demoRepository;

    @Autowired
    public DemoController(DemoRepository demoRepository) {
        this.demoRepository = demoRepository;
    }

    @GetMapping("/all")
    public List<DemoEntity> getAll() {
        return demoRepository.findAll();
    }

    @PostMapping("/add")
    public DemoEntity addDemo(@RequestBody DemoEntity demo) {
        return demoRepository.save(demo);
    }
}
