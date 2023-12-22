package com.action;

import com.alibaba.fastjson.JSON;
import com.dao.UserTeamDao;
import com.dao.UsercontrolTeamDao;
import com.dao.impl.UserTeamDaoimpl;
import com.dao.impl.UsercontrolTeamDaoimpl;
import com.entity.user.UserTeam;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class TeamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setCharacterEncoding ("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        UserTeamDao userTeamDao = new UserTeamDaoimpl();
        String UserId = null;
        UserId = request.getParameter("UserId");
        List<UserTeam> userTeamList = userTeamDao.getAll("select * from UserTeam, Team where UserTeam.UserId = Team.UserId, UserTeam.UserId = '" + UserId + "'");
        out.print(JSON.toJSON(userTeamList));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        String action = request.getParameter("action");
        if(action.equals("newTeam")){
            String UserId = request.getParameter("UserId");
            String TeamId = request.getParameter("TeamId");
            UsercontrolTeamDao usercontrolteamDao = new UsercontrolTeamDaoimpl();
            String index = usercontrolteamDao.getmaxindex("userteam");
            index = Integer.toString(Integer.parseInt(index)+1);
            UserTeam userteam = new UserTeam(index, UserId, TeamId, null, null, null, null);
            usercontrolteamDao.newTeam(userteam);
        }
        else if (action.equals("removeTeam")) {
            String UserId = request.getParameter("UserId");
            String TeamId = request.getParameter("TeamId");
            UsercontrolTeamDao usercontrolteamDao = new UsercontrolTeamDaoimpl();
            String index = usercontrolteamDao.getmaxindex("userteam");
            UserTeam userteam = new UserTeam(index, UserId, TeamId, null, null, null, null);

            usercontrolteamDao.removeTeam(userteam);
        }
        doGet(request, response);
    }
}
