package com.czj.helloworld.controller;

import com.czj.helloworld.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    public String hello(){
        System.out.println("test");
        return "hello world";
    }

    @RequestMapping(value = "add",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public String addUser(User user){

        if(null!=user){
            return user.toString();
        }

        return new User().toString();

    }
}
