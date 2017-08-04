package com.chenzhijun.jdbctemplate.service.impl;

import com.chenzhijun.jdbctemplate.entity.User;
import com.chenzhijun.jdbctemplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void create(User user) {
        int update = jdbcTemplate.update("insert into tbl_user_info(id,name) values(?,?)", user.getId(), user.getName());
        System.out.println(update);
    }
}
