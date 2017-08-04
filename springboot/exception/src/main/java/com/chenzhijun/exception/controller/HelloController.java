package com.chenzhijun.exception.controller;

import com.chenzhijun.exception.handler.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {


    @GetMapping("/json")
    public String json() throws Exception {
        throw new MyException("发生错误");
    }
}
