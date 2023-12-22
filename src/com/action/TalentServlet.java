package com.action;

import com.alibaba.fastjson.JSON;
import com.dao.TalentDao;
import com.dao.impl.TalentDaoimpl;
import com.entity.Talents;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TalentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setCharacterEncoding ("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        TalentDao talentDao = new TalentDaoimpl();
        List<Talents> talentsList = talentDao.getAll("select * from talents");
        out.print(JSON.toJSON(talentsList));
    }
}
