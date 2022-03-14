package com.dhawal.spring.project.springdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping
    public String helloWorld() {
        return "Hello world from Spring boot";
    }

    @RequestMapping("/goodbye")
    public String goodBye() {
        return "Good Bye from Spring boot";
    }
}
