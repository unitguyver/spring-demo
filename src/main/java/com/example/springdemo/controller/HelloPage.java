package com.example.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPage {
    @RequestMapping("hello")
    public String hello(){
        return "Hello World";
    }
}
