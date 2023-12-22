package com.action;
import com.dao.Admin_loginDao;
import com.dao.impl.Admin_loginDaoimpl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Admin_loginServlet", value = "/Admin_loginServlet")
public class Admin_loginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding ("UTF-8");
        String UserId = request.getParameter("UserId");
        String PassWord = request.getParameter("PassWord");
        Admin_loginDao adminLoginDao = new Admin_loginDaoimpl();
        boolean login_success = adminLoginDao.login(UserId, PassWord);
        if(login_success){
            response.sendRedirect("login_success.jsp");
        }else{
            response.sendRedirect("login_failed.jsp");
        }
    }
}
