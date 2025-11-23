package com.example.customiztaion.controller;

import com.example.customiztaion.serviceimplementation.Parameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Parameter;

@RestController
public class rest {
        @GetMapping("/doorcustomization")


        @Autowired
        public String hello(Parameters  parameters) {


            return "0";
        }

}
