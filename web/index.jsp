<%--
  Created by IntelliJ IDEA.
  User: yangfeng
  Date: 2023/12/2
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <link data-n-head="ssr" rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/首页/img/favicon.ico">
  <title>Welcome to My Website</title>
  <link rel="stylesheet" href="./观测·Wiki/css/style.css">

  <style>
    /* 在这里写入CSS代码 */
    body {
      background-image: url('./观测·Wiki/img/芙宁娜.jpg');
      background-size: cover; /* 背景图片覆盖整个页面 */
      background-repeat: no-repeat; /* 背景图片不重复 */
      background-attachment: fixed; /* 背景图片固定，不随滚动条滚动 */
      background-position: center center; /* 背景图片居中 */
    }
  </style>
</head>
<body>

<h1>Welcome to My Website</h1>

<div id="mw-content-text1">
  <h2>Options:</h2>
  <ul>
    <li><a href="观测·Wiki/Wiki.html">Enter Wiki</a></li>
    <li><a href="首页/Admin_login.html">Admin Login</a></li>
    <li><a href="首页/User_login.html">User Login</a></li>
  </ul>
</div>

</body>
</html>
