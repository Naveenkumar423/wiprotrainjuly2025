package com.wipro.springsecuritydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - Public endpoint";
    }

    @GetMapping("/greet")
    public String greet() {
        return "Hello from Greet - Requires login";
    }

    @GetMapping("/bye")
    public String bye() {
        return "Goodbye - Requires login";
    }
}
