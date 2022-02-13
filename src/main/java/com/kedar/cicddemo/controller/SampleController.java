package com.kedar.cicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    @GetMapping("/hello")
    public String helloController(){
        return "Hello world";
    }

}
