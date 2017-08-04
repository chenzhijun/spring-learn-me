package com.chenzhijun.swagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping("hello/{userId}/{userName}/{id}")
    public String hello(String userId,String userName,Integer id){
       return "userId:"+userId+",userName:"+userName+",id:"+id;
    }
}
