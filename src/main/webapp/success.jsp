<%@ page import="javafx.print.Printer" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="cn.ziming.login.demo.entity.User" %><%--
  Created by IntelliJ IDEA. To change this template use File | Settings | File Templates.
  User: martin | Date: 2019/4/12 | Time: 21:43
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功</title>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
    String timeStamp = session.getAttribute("timestamp").toString();
    String username = user.getUsername();

%>
    登陆成功 登录时间:<%=timeStamp %> <br>
    您的用户名为:<%=user.getUsername() %> <br>
    您的登陆ID为:<%=user.getLoginId() %> <br>
    您的登陆密码为:<%=user.getLoginPwd() %>
</body>
</html>
