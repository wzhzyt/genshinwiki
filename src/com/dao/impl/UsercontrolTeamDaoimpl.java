package com.dao.impl;

import com.DBUtil.DBUtil;
import com.dao.UsercontrolTeamDao;
import com.entity.user.UserTeam;

public class UsercontrolTeamDaoimpl implements UsercontrolTeamDao {
    @Override
    public  String getmaxindex(String tablename){
        DBUtil dbUtil = new DBUtil();
        return dbUtil.getMaxIndex(tablename);
    }
    @Override
    public void newTeam(UserTeam userteam){
        DBUtil dbUtil = new DBUtil();
        String UserId = userteam.getUserId();
        String TeamId = userteam.getTeamId();
        String Maxindex =  dbUtil.getMaxIndex("UserTeam");
        String index = Integer.toString(Integer.parseInt(Maxindex)+1);
        dbUtil.executeUpdate("insert into UserTeam(`index`, UserId, TeamId) values('" + index + "','" + UserId + "','" + TeamId + "')");
        dbUtil.close();
    }
    @Override
    public void removeTeam(UserTeam userteam){
        DBUtil dbUtil = new DBUtil();
        String UserId  = userteam.getUserId();
        String TeamId = userteam.getTeamId();
        dbUtil.executeUpdate("delete from UserTeam where UserId = '" + UserId + "' and TeamId = '" + TeamId + "'");
        dbUtil.executeUpdate("delete from team where TeamId = '"+ TeamId +"'");
        dbUtil.close();
    }
}
