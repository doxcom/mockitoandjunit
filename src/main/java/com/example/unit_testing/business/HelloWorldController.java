package com.example.unit_testing.business;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //restful service

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

}
