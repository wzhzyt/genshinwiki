package com.dao;

import com.entity.user.Team;
import com.entity.user.UserTeam;

import java.util.List;

public interface UserTeamDao {
    void add_character(UserTeam userteam);
    void modify_character(UserTeam userteam);

    List<UserTeam> getAll(String sql);
}
