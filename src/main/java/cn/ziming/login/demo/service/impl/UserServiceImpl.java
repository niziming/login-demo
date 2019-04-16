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
        User userInput = new User(loginId, loginPwd);
        UserDao userDao = new UserDaoImpl();
        User user = userDao.findUserByIdAndPwd(userInput);

        return user;
    }
}
