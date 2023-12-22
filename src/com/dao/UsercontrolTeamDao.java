package com.dao;

import com.entity.user.UserTeam;

public interface UsercontrolTeamDao {
    String getmaxindex(String tablename);
    void newTeam(UserTeam userteam);
    void removeTeam(UserTeam userteam);
}
