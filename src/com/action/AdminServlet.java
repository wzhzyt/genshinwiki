package com.action;
import com.dao.AdminDao;
import com.dao.CharacterDao;
import com.dao.impl.AdminDaoimpl;
import com.dao.impl.CharacterDaoimpl;
import com.entity.Admin;
import com.alibaba.fastjson.JSON;
import com.entity.Character;
import com.entity.user.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
@WebServlet(name = "AdminServlet", value = "/AdminServlet")
public class AdminServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setCharacterEncoding ("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");
        if (action.equals("Admin")) {
            AdminDao adminDao = new AdminDaoimpl();
            List<User> userList = adminDao.getAll_user("select * from User");
            out.print(JSON.toJSON(userList));
        }else if(action.equals("Character")){
            CharacterDao characterDao = new CharacterDaoimpl();
            List<Character> characterList = characterDao.getAll("select * from characters");
            out.print(JSON.toJSON(characterList));
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String action = request.getParameter("action");
        if("add_admin".equals(action)){
            String UserId = request.getParameter("UserId");
            String UserName = request.getParameter("UserName");
            String PassWord = request.getParameter("PassWord");
            User user = new User(UserId, UserName, PassWord);
            AdminDao adminDao = new AdminDaoimpl();
            adminDao.add_user(user);
        } else if ("remove_admin".equals(action)) {
            String UserId = request.getParameter("UserId");
            AdminDao adminDao = new AdminDaoimpl();
            adminDao.remove_user(UserId);
        } else if ("modify_admin".equals(action)) {
            String UserId = request.getParameter("UserId");
            String PassWord = request.getParameter("PassWord");
            User user= new User(UserId, null, PassWord);
            AdminDao adminDao = new AdminDaoimpl();
            adminDao.modify_user(user);
        }else if("add_character".equals(action)){
            String id, name, element, weapon, rank, region, icon = null;
            id = request.getParameter("id");
            name = request.getParameter("name");
            element = request.getParameter("element");
            weapon = request.getParameter("weapon");
            rank = request.getParameter("rank");
            region = request.getParameter("region");
            icon = request.getParameter("icon");
            Character character = new Character(id,name,element,weapon,rank,region,icon);
            AdminDao adminDao = new AdminDaoimpl();
            adminDao.add_character(character);
        }else if ("remove_character".equals(action)){
            String id, name = null;
            id = request.getParameter("id");
            AdminDao adminDao = new AdminDaoimpl();
            adminDao.remove_character(id);
        }else if("modify_character".equals(action)){
            String id, name, element, weapon, rank, region, icon = null;
            id = request.getParameter("id");
            name = request.getParameter("name");
            element = request.getParameter("element");
            weapon = request.getParameter("weapon");
            rank = request.getParameter("rank");
            region = request.getParameter("region");
            icon = request.getParameter("icon");
            Character character = new Character(id,name,element,weapon,rank,region,icon);
            AdminDao adminDao = new AdminDaoimpl();
            adminDao.modify_character(character);
        }
        doGet(request, response);
    }
}
