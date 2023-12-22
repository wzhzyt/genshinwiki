package com.action;

import com.dao.User_loginDao;
import com.dao.impl.User_loginDaoimpl;
import com.entity.user.User;

import javax.security.sasl.SaslException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "User_loginServlet", value = "/User_loginServlet")
public class User_loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws SaslException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if(action.equals("login")){
            String UserId = request.getParameter("UserId");
            String PassWord = request.getParameter("PassWord");
            User_loginDao user_loginDao = new User_loginDaoimpl();
            boolean login_success = user_loginDao.login(UserId, PassWord);
            if(login_success){
                request.getSession().setAttribute("UserId", UserId);
                response.sendRedirect("/GenshinWIKI_web_war_exploded/user_login_success.jsp");
            }else{
                response.sendRedirect("login_failed.jsp");
            }
        }
        else if(action.equals("Registration")){
            String UserId = request.getParameter("UserId");
            String Password = request.getParameter("PassWord");
            String name = request.getParameter("name");
            User_loginDao user_loginDao = new User_loginDaoimpl();
            User user = new User(UserId, Password, name);
            user_loginDao.createAccount(user);
            response.sendRedirect("/GenshinWIKI_web_war_exploded/首页/User_login.html");
        }
    }
}
