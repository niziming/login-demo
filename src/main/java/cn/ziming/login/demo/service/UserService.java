package cn.ziming.login.demo.service;

import cn.ziming.login.demo.entity.User;

public interface UserService {
    public User login(String loginId, String loginPwd);
}
