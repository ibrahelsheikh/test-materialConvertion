package com.example.customiztaion.controller;

import com.example.customiztaion.serviceimplementation.Parameters;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Parameter;

@RestController

public class rest {
        @GetMapping("/")

        public String hello() {
            Parameters parameters = new Parameters();


            return parameters;
        }

}
