package com.action;

import com.DBUtil.DBUtil;
import com.alibaba.fastjson.JSON;
import com.dao.UserCharacterDao;
import com.dao.impl.UserCharacterDaoimpl;
import com.entity.user.User_character;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UserCharacterServlet", value = "/UserCharacterServlet")
public class UserCharacterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setCharacterEncoding ("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        UserCharacterDao userCharacterDao = new UserCharacterDaoimpl();
        String UserId = null;
        UserId = request.getParameter("UserId");
        List<User_character> user_characterList = userCharacterDao.getAll("select distinct 'index',UserId,name from user_character,characters where UserId = '"+ UserId +"' and user_character.characterId = characters.id");
        out.print(JSON.toJSON(user_characterList));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String action = request.getParameter("action");
        if(action.equals("add_characters")){
            String UserId, characterId = null;
            DBUtil dbUtil = new DBUtil();
            String index = dbUtil.getMaxIndex("userteam");
            index = Integer.toString(Integer.parseInt(index)+1);
            dbUtil.close();
            UserId = request.getParameter("UserId");
            characterId = request.getParameter("characterId");
            User_character user_character = new User_character(index, UserId, characterId);
            UserCharacterDao userCharacterDao = new UserCharacterDaoimpl();
            userCharacterDao.add_characters(user_character);
            PrintWriter out = response.getWriter();
            out.print(JSON.toJSON(user_character));
        }
        else if(action.equals("remove_characters")){
            String UserId, characterId = null;
            UserId = request.getParameter("UserId");
            characterId = request.getParameter("characterId");
            User_character user_character = new User_character(null, UserId, characterId);
            UserCharacterDao userCharacterDao = new UserCharacterDaoimpl();
            userCharacterDao.remove_characters(user_character);
            PrintWriter out = response.getWriter();
            out.print(JSON.toJSON(user_character));
        }
        doGet(request, response);
    }
}
