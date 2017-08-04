package com.chenzhijun.jpa.repository;

import com.chenzhijun.jpa.JpaApplicationTests;
import com.chenzhijun.jpa.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class UserRepoTest extends JpaApplicationTests {

    @Autowired
    private UserRepo userRepo;

    @Test
    public void create() throws Exception{
        User user = new User();
        user.setAge(11);
        user.setName("lucy");
        userRepo.save(user);
    }

    @Test
    public void findByName() throws Exception {
        System.out.println("=========================================");
        User lucy = userRepo.findByName("lucy");
        if (lucy == null) {
            System.out.println("true");
        }
        System.out.println(lucy);
        System.out.println("=========================================");

    }

    @Test
    public void findByNameAndAge() throws Exception {
    }

    @Test
    public void findUser() throws Exception {
    }

}