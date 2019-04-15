package cn.ziming.login.demo.dao.impl;

import cn.ziming.login.demo.dao.UserDao;
import cn.ziming.login.demo.entity.User;
import cn.ziming.login.demo.web.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {


    @Override
    public boolean createUser(User user) {
        try {
            String sql = "insert into test_user(username, loginId, loginPwd) values(?,?,?)";
            Connection conn = DBUtil.getConn();

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getLoginId());
            preparedStatement.setString(3, user.getLoginPwd());
            // 执行语句
            preparedStatement.execute();

            preparedStatement.close();
            conn.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return false;
    }

    @Override
    public boolean delectUser(User user) {
        return false;
    }

    @Override
    public User findUserByIdAndPwd(User user) {
        try {
            String sql = "select * from test_user where loginId = ? and loginPwd = ?";
            Connection conn = DBUtil.getConn();

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, user.getLoginId());
            preparedStatement.setString(2, user.getLoginPwd());
            // 执行语句
            // preparedStatement.execute();
            ResultSet resultSet= preparedStatement.executeQuery();
            System.out.println(resultSet);
            // 结果集
            // resultSet = preparedStatement.getResultSet();
            if (resultSet != null){
                while (resultSet.next()){
                    String username = resultSet.getString("username");
                    user.setUsername(username);
                    return user;
                }
            } else {
            }
            resultSet.close();
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;

    }

    @Override
    public boolean upDataUser(User user) {
        return false;
    }


}
