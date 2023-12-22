package com.entity.user;

import java.util.ArrayList;

public class UserTeam {
    private String index;
    private String TeamId;

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    private String UserId;
    Team team;

    public UserTeam(){};
    public UserTeam(String index,String TeamId,String UserId, String member1, String member2, String member3, String member4){
        this.index = index;
        this.TeamId = TeamId;
        this.UserId = UserId;
        this.team = new Team(TeamId, member1, member2, member3, member4);
    }

    public String getTeamId() {
        return TeamId;
    }

    public void setTeamId(String teamId) {
        TeamId = teamId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getUserId() {
        return UserId;
    }

    public Team getTeam() {
        return team;
    }
}
