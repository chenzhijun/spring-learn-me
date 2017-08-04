package com.chenzhijun.mybatis.mapper;

import com.chenzhijun.mybatis.MybatisApplicationTests;
import com.chenzhijun.mybatis.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserMapperTest extends MybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void findByName() throws Exception {
        userMapper.insert("AAA", 20);
        User u = userMapper.findByName("AAA");
        Assert.assertEquals(20, u.getAge().intValue());
    }

    @Test
    public void insert() throws Exception {
    }

}