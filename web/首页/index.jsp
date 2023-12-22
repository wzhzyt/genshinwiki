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
  <script src="./js/jquery-3.7.1.js"></script>
  <link rel="stylesheet" href="./观测·Wiki/css/style.css">
  <link rel="stylesheet" type="text/css" href="./观测·Wiki/css/normalize.css" />
  <link rel="stylesheet" type="text/css" href="./观测·Wiki/font/font-awesome-4.2.0/css/font-awesome.min.css" />
  <link rel="stylesheet" type="text/css" href="./观测·Wiki/css/demo.css" />
  <link rel="stylesheet" type="text/css" href="./观测·Wiki/css/component.css" />
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
  <style>
    /* 设置表单居中 */
    #addCharacterForm {
      text-align: center; /* 将文本居中 */
      margin: 0 auto; /* 上下边距为0，左右自动，实现水平居中 */
      width: fit-content; /* 调整宽度以适应内容 */
    }
    /* 为输入框和按钮设置一些样式，例如间距 */
    #addCharacterForm input, #addCharacterForm button {
      margin-bottom: 10px; /* 每个元素下方的间距 */
      display: block; /* 每个元素占满整行 */
    }
  </style>

</head>
<body>



<div id="mw-content-text1">
  <h1>Welcome to My Website</h1>
  <h2>Options:</h2>
  <ul>
    <li><a href="观测·Wiki/Wiki.html">Enter Wiki</a></li>
    <li><a href="首页/Admin_login.html">Admin Login</a></li>
    <li><a href="首页/User_login.html">User Login</a></li>
  </ul>
</div>

</body>
</html>
