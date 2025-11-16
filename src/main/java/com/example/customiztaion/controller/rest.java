package com.example.customiztaion.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class rest {
        @GetMapping("/")
        public String hello() {
            return "Hello, Spring Boot is running!";

        }

}
