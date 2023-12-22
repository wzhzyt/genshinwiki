package com.action;

import com.dao.CharacterDao;
import com.dao.impl.CharacterDaoimpl;
import com.entity.Character;
import com.alibaba.fastjson.JSON;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setCharacterEncoding ("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        CharacterDao characterDao = new CharacterDaoimpl();
        List<Character> characterList = characterDao.getAll("select * from characters");
        out.print(JSON.toJSON(characterList));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String action = request.getParameter("action");
        if(action.equals("search_character")){
            int count = 0;
            String name, element, weapon, rank, region = null;
            name = request.getParameter("name");
            element = request.getParameter("element");
            weapon = request.getParameter("weapon");
            rank = request.getParameter("rank");
            region = request.getParameter("region");
            String sql = "select * from characters where ";
            if(name != null){
                sql = sql + " name = '"+ name +"'";
                count++;
            }
            else if(element != null){
                if(count != 0) {
                    sql = sql + " and element = '"+ element +"'";
                    count++;
                }else{
                    sql = sql + " element = '"+ element +"'";
                    count++;
                }
            }
            else if(weapon != null){
                if(count != 0) {
                    sql = sql + " and weapon = '"+ weapon +"'";
                    count++;
                }else{
                    sql = sql + " weapon = '"+ weapon +"'";
                    count++;
                }
            }
            else if(rank != null){
                if(count != 0) {
                    sql = sql + " and rank = '"+ rank +"'";
                    count++;
                }else{
                    sql = sql + " rank = '"+ rank +"'";
                    count++;
                }
            }
            else if(region != null){
                if(count != 0) {
                    sql = sql + " and region = '"+ region +"'";
                    count++;
                }else{
                    sql = sql + " region = '"+ region +"'";
                    count++;
                }
            }
            PrintWriter out = response.getWriter();
            CharacterDao characterDao = new CharacterDaoimpl();
            List<Character> characterList = characterDao.search(sql);
            out.print(JSON.toJSON(characterList));
        }
        doGet(request, response);
    }
}
