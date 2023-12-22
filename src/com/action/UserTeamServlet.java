package com.action;

import com.DBUtil.DBUtil;
import com.alibaba.fastjson.JSON;
import com.dao.UserCharacterDao;
import com.dao.UserTeamDao;
import com.dao.UsercontrolTeamDao;
import com.dao.impl.UserCharacterDaoimpl;
import com.dao.impl.UserTeamDaoimpl;
import com.dao.impl.UsercontrolTeamDaoimpl;
import com.entity.user.UserTeam;
import com.entity.user.User_character;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "UserTeamServlet", value = "/UserTeamServlet")
public class UserTeamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        response.setCharacterEncoding ("UTF-8");
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        UserTeamDao userTeamDao = new UserTeamDaoimpl();
        String UserId = null;
        UserId = request.getParameter("UserId");
        List<UserTeam> userTeamList = userTeamDao.getAll("WITH teams AS (SELECT DISTINCT `index`,userId,Team.TeamId,member1,member2,member3,member4 FROM UserTeam,Team WHERE UserTeam.TeamId = Team.TeamId AND UserTeam.UserId = '" + UserId + "') SELECT t.index, t.userId,t.TeamId,c1.name AS member1,c2.name AS member2,c3.name AS member3,c4.name AS member4 FROM teams t LEFT JOIN characters c1 ON t.member1 = c1.id LEFT JOIN characters c2 ON t.member2 = c2.id LEFT JOIN characters c3 ON t.member3 = c3.id LEFT JOIN characters c4 ON t.member4 = c4.id;");
        out.print(JSON.toJSON(userTeamList));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action.equals("add_character")) {
            String UserId, TeamId, member1, member2, member3, member4 = null;
            DBUtil dbUtil = new DBUtil();
            String index = dbUtil.getMaxIndex("userteam");
            index = Integer.toString(Integer.parseInt(index) + 1);
            dbUtil.close();
            UserId = request.getParameter("UserId");
            TeamId = request.getParameter("TeamId");
            member1 = request.getParameter("member1");
            member2 = request.getParameter("member2");
            member3 = request.getParameter("member3");
            member4 = request.getParameter("member4");
            UserTeam userteam = new UserTeam(index, TeamId, UserId, member1, member2, member3, member4);
            UserTeamDao userteamDao = new UserTeamDaoimpl();
            userteamDao.add_character(userteam);
            PrintWriter out = response.getWriter();
            out.print(JSON.toJSON(userteam));
        } else if (action.equals("modify_character")) {
            String UserId, TeamId, member1, member2, member3, member4 = null;
            DBUtil dbUtil = new DBUtil();
            String index = dbUtil.getMaxIndex("userteam");
            index = Integer.toString(Integer.parseInt(index));
            dbUtil.close();
            UserId = request.getParameter("UserId");
            TeamId = request.getParameter("TeamId");
            member1 = request.getParameter("member1");
            member2 = request.getParameter("member2");
            member3 = request.getParameter("member3");
            member4 = request.getParameter("member4");
            UserTeam userteam = new UserTeam(index, TeamId, UserId, member1, member2, member3, member4);
            UserTeamDao userteamDao = new UserTeamDaoimpl();
            userteamDao.modify_character(userteam);
        } else if (action.equals("removeTeam")) {
            String TeamId, UserId = null;
            UserId = request.getParameter("UserId");
            TeamId = request.getParameter("TeamId");
            UserTeam userTeam = new UserTeam(null, TeamId, UserId, null, null, null, null);
            UsercontrolTeamDao usercontrolTeamDao = new UsercontrolTeamDaoimpl();
            usercontrolTeamDao.removeTeam(userTeam);
        }
        doGet(request, response);
    }
}
