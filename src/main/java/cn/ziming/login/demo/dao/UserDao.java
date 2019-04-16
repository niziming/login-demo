package cn.ziming.login.demo.dao;

import cn.ziming.login.demo.entity.User;

public interface UserDao {

    public boolean createUser(User user) throws Exception;
    public boolean deleteUser(User user);
    public User findUserByIdAndPwd(User user);
    public boolean upDataUser(User user);

}
