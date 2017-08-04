package com.chenzhijun.jdbctemplate.service;

import com.chenzhijun.jdbctemplate.JdbctemplateApplication;
import com.chenzhijun.jdbctemplate.JdbctemplateApplicationTests;
import com.chenzhijun.jdbctemplate.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserServiceImplTest extends JdbctemplateApplicationTests {


    @Autowired
    private UserService userService;

    @Test
    public void create() throws Exception {
        User user = new User();
        user.setId(123);
        user.setName("chenzhijun");
        userService.create(user);
        System.out.println("ok");
    }

}