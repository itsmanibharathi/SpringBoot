package com.example.demo_jdbc.Entity;

import java.io.Serializable;

public class DemoEntity implements Serializable {
    private Long id;
    private String name;

    // Constructors, getters, and setters
    public DemoEntity() {
    }

    public DemoEntity(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public DemoEntity(String name) {
        this.name = name;
    }

    public DemoEntity(Long id) {
        this.id = id;
    }

    public DemoEntity(DemoEntity entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public DemoEntity clone() {
        return new DemoEntity(this);
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public DemoEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public DemoEntity setName(String name) {
        this.name = name;
        return this;
    }

    
}

