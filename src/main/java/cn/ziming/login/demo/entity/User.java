package cn.ziming.login.demo.entity;

import java.io.Serializable;

/**
 * 用户表
 */
public class User implements Serializable {
    /*
     * 序列化
     * 有很多网络传输使用的都是 Serializable
     * 它可以先将代码保存为 io，然后在反序列化回来了。
     */
    private String username;
    private String loginId;
    private String loginPwd;
    /*
    构造
     */
    public User(String username, String loginId, String loginPwd) {
        this.username = username;
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }
    public User(String loginId, String loginPwd) {
        this.username = username;
        this.loginId = loginId;
        this.loginPwd = loginPwd;
    }
    public User() {}

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", loginId='" + loginId + '\'' +
                ", loginPwd='" + loginPwd + '\'' +
                '}';
    }
}
