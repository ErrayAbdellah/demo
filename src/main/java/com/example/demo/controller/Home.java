package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class Home {


    @GetMapping
    public String home(){
        return "hello abdellah";
    }
    @GetMapping("/hello")
    public String hello(){
        return "hello erray";
    }

    @GetMapping("/hello1")
    public String hello1(){
        return "hello1  erray";
    }

}
