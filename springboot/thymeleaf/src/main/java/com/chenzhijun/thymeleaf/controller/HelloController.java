package com.chenzhijun.thymeleaf.controller;

import com.chenzhijun.thymeleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @GetMapping("index/{userId}/{age}")
    public String index(User user){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user);
        modelAndView.addObject("host", "http://blog.didispace.com");
        return "index";

    }
}
