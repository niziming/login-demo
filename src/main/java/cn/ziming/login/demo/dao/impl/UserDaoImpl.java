package cn.ziming.login.demo.dao.impl;

import cn.ziming.login.demo.dao.UserDao;
import cn.ziming.login.demo.entity.User;

public class UserDaoImpl implements UserDao {
    /**
     * User login
     * @param loginId ID
     * @param loginPwd PWD
     * @return String Result
     */
    @Override
    public User login(String loginId, String loginPwd) {
        User user = null;

        // 直接更具loginId查询出这个用户
        if("admin".equalsIgnoreCase(loginId)) {
            if("admin".equalsIgnoreCase(loginPwd)){
               user = new User();
               user.setUsername("Lusifer");
               user.setLoginId("admin");
               user.setLoginPwd("admin");
            }
        }
        // 在根据传入的密码匹配
        return user;
    }
}
