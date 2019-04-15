package cn.ziming.login.demo.web.controller;

import cn.ziming.login.demo.dao.impl.UserDaoImpl;
import cn.ziming.login.demo.entity.User;
import cn.ziming.login.demo.service.UserService;
import cn.ziming.login.demo.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 登陆控制器
 */
@WebServlet(name = "LoginController")
public class LoginController extends HttpServlet {
    /*
    get与post的区别
    get:
        1.传参是明文
        2.大小限制4KB
        3.参数是Url?之后
        4.不可以上传文件
        5.语义区别:获取
        6.请求一次
        7.在涉及RESTful API时具有幂等性
    post:
        1.传参密文
        2.大小无限制
        3.也可以在URL后但是一般不这样
        4.可以上传文件
        5.语义区别:提交
        6.请求是2次:
            1.第一次请求服务器是否可以传数据
            2.如果可以则再请求一次
        7.在涉及RESTful API时不具备幂等性
    幂等性:
    HTTP幂等性,指无论调用多少次都不会有不同结果的HTTP方法.
    不管你调用1次还是100次结果都是相同的
     */

    private UserService userService = new UserServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginId = request.getParameter("loginId");
        String loginPwd = request.getParameter("loginPwd");

        User user = userService.login(loginId, loginPwd);
        // UserDaoImpl userdaoimpl = new UserDaoImpl();
        // User user = userdaoimpl.login(loginId, loginPwd);

        // 登陆失败的处理
        if (user == null) {
            request.getRequestDispatcher("/fail.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/success.jsp").forward(request, response);
        }
    }
}
