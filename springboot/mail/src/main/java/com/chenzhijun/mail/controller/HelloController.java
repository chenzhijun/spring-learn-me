package com.chenzhijun.mail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("index")
    public String hello(){
        return "hello,mail";

    }
}
