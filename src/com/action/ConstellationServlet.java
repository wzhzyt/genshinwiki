package com.action;

import com.alibaba.fastjson.JSON;
import com.dao.ConstellationDao;
import com.dao.impl.ConstellationDaoimpl;
import com.entity.Constellations;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ConstellationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setCharacterEncoding ("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        ConstellationDao constellationDao = new ConstellationDaoimpl();
        List<Constellations> constellationsList = constellationDao.getAll("select * from constellations");
        out.print(JSON.toJSON(constellationsList));
    }
}
