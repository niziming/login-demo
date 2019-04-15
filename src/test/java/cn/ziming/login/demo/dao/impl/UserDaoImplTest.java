package cn.ziming.login.demo.dao.impl;

import cn.ziming.login.demo.dao.UserDao;
import cn.ziming.login.demo.entity.User;
import org.junit.Test;

public class UserDaoImplTest {

    @Test
    public void createUser() throws Exception {
        User user = new User("liubin", "300000", "liubin");
        UserDao userDao = new UserDaoImpl();
        userDao.createUser(user);
    }

    @Test
    public void findUserByIdAndPwd() {
        User user = new User();
        user.setLoginId("30000");
        user.setLoginPwd("liubin");
        UserDao userDao = new UserDaoImpl();
        User userByIdAndPwd = userDao.findUserByIdAndPwd(user);
        System.out.println(userByIdAndPwd);
    }
}