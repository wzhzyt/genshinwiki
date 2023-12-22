package com.dao.impl;

import com.DBUtil.DBUtil;
import com.dao.UserTeamDao;
import com.entity.user.Team;
import com.entity.user.User;
import com.entity.user.UserTeam;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserTeamDaoimpl implements UserTeamDao {
    @Override
    public void add_character(UserTeam userteam){
        DBUtil dbUtil = new DBUtil();
        String index = userteam.getIndex();
        String UserId = userteam.getUserId();
        String TeamId = userteam.getTeam().getTeam_id();
        String member1 = userteam.getTeam().getMember1();
        String member2 = userteam.getTeam().getMember2();
        String member3 = userteam.getTeam().getMember3();
        String member4 = userteam.getTeam().getMember4();
        dbUtil.executeUpdate("insert into Team(TeamId, member1, member2, member3, member4) values('" + TeamId + "','" + member1 + "','" + member2 + "','" + member3 + "','" + member4 + "')");
        dbUtil.executeUpdate("insert into UserTeam(`index`, UserId, TeamId) values('" + index + "','" + UserId + "','" + TeamId + "')");
        dbUtil.close();
    }

    @Override
    public List<UserTeam> getAll(String sql){
        List<UserTeam> teamList = new ArrayList<>();
        DBUtil dbUtil = new DBUtil();
        ResultSet rs = dbUtil.executeQuery(sql);
        String index, UserId, TeamId, member1, member2, member3, member4;
        try{
            while (rs.next()){
                index = rs.getString(1);
                UserId = rs.getString(2);
                TeamId = rs.getString(3);
                member1 = rs.getString(4);
                member2 = rs.getString(5);
                member3 = rs.getString(6);
                member4 = rs.getString(7);
                teamList.add(new UserTeam(index, TeamId, UserId, member1, member2, member3, member4));
            }

            dbUtil.close();
            return  teamList;
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        finally {
            dbUtil.close();
            return teamList;
        }
    }
    @Override
    public void modify_character(UserTeam userteam){
        DBUtil dbUtil = new DBUtil();
        String index = userteam.getIndex();
        String UserId = userteam.getUserId();
        String TeamId = userteam.getTeamId();
        String member1 = userteam.getTeam().getMember1();
        String member2 = userteam.getTeam().getMember2();
        String member3 = userteam.getTeam().getMember3();
        String member4 = userteam.getTeam().getMember4();
        System.out.println(index);
        System.out.println(UserId);
        System.out.println(TeamId);
        System.out.println(member1);
        System.out.println(member2);
        System.out.println(member3);
        System.out.println(member4);
        dbUtil.executeUpdate("update Team set member1 = '" + member1 + "',member2 = '" + member2 + "',member3 = '" + member3 + "',member4 = '" + member4 + "' where TeamId = '" + TeamId +"'");
        dbUtil.close();
    }
}
