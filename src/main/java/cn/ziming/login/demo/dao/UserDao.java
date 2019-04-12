package cn.ziming.login.demo.dao;

import cn.ziming.login.demo.entity.User;

public interface UserDao {

    public User login(String loginId, String loginPwd);
}
