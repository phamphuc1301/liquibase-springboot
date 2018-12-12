package com.example.liquibasespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("api")
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Fk you ";
    }
}