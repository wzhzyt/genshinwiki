<%--
  Created by IntelliJ IDEA.
  User: yangfeng
  Date: 2023/12/5
  Time: 12:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // 这里可以进行一些逻辑处理或其他操作
    response.setCharacterEncoding ("UTF-8");
    String encodedParam = java.net.URLEncoder.encode("管理员界面", "UTF-8");
    // 重定向到另一个网址
    response.sendRedirect("./" + encodedParam+ "/Admin.html");
%>
