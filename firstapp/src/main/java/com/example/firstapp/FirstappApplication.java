package com.example.firstapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FirstappApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstappApplication.class, args);
	}
}

@RestController
class HelloWorldController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }
}