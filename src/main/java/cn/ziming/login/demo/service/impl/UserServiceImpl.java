package cn.ziming.login.demo.service.impl;

import cn.ziming.login.demo.dao.UserDao;
import cn.ziming.login.demo.dao.impl.UserDaoImpl;
import cn.ziming.login.demo.entity.User;
import cn.ziming.login.demo.service.UserService;

public class UserServiceImpl implements UserService {
    /**
     * 用户登陆业务逻辑
     * @param loginId
     * @param loginPwd
     * @return
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
