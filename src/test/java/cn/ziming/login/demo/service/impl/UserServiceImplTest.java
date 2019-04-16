package cn.ziming.login.demo.service.impl;

import cn.ziming.login.demo.entity.User;
import cn.ziming.login.demo.service.UserService;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserServiceImplTest {

    @Test
    public void login() {
        UserService userService = new UserServiceImpl();

        User login = userService.login("asdf", "asdf");

        System.out.println(login);

    }
}