package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class userController {
    @RequestMapping("/")
    public String test() {
        return "hello word1";
    }
}
