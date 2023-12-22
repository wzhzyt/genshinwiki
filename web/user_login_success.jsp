<%--
  Created by IntelliJ IDEA.
  User: yangfeng
  Date: 2023/12/14
  Time: 10:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userId = (String) session.getAttribute("UserId");
    // 这里可以进行一些逻辑处理或其他操作
    response.setCharacterEncoding("UTF-8");
    String encodedParam = java.net.URLEncoder.encode("观测·Wiki", "UTF-8");

    // 将 userId 作为查询参数添加到 URL
    String redirectUrl = "./" + encodedParam + "/Wiki.html?userId=" + java.net.URLEncoder.encode(userId, "UTF-8");

    // 重定向到另一个网址
    response.sendRedirect(redirectUrl);
%>
