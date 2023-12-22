package com.action;
import com.dao.AdminDao;
import com.dao.CharacterDao;
import com.dao.impl.AdminDaoimpl;
import com.dao.impl.CharacterDaoimpl;
import com.entity.Character;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import com.alibaba.fastjson.JSON;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
public class Admin_CharacterServlet extends  HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setCharacterEncoding ("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        CharacterDao characterDao = new CharacterDaoimpl();
        List<Character> characterList = characterDao.getAll("select * from Characters");
        out.print(JSON.toJSON(characterList));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String action = request.getParameter("action");
        if("add_character".equals(action)){
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String element = request.getParameter("element");
            String weapon = request.getParameter("weapon");
            String rank = request.getParameter("rank");
            String region = request.getParameter("region");
            String icon = request.getParameter("icon");
            Character character = new Character(id, name, element, weapon, rank, region,icon);
            AdminDao adminDao = new AdminDaoimpl();
            adminDao.add_character(character);
        } else if ("remove_character".equals(action)) {
            String id = request.getParameter("id");
            AdminDao adminDao = new AdminDaoimpl();
            adminDao.remove_character(id);
        } else if ("modify_character".equals(action)) {
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String element = request.getParameter("element");
            String weapon = request.getParameter("weapon");
            String rank = request.getParameter("rank");
            String region = request.getParameter("region");
            String icon = request.getParameter("icon");
            Character character = new Character(id, name, element, weapon, rank, region,icon);
            AdminDao adminDao = new AdminDaoimpl();
            adminDao.modify_character(character);
        }
        doGet(request, response);
    }
}
