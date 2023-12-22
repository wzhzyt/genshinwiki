package com.entity.user;

public class Team {
    private String team_id;
    private String member1;
    private String member2;
    private String member3;
    private String member4;
    public String getTeam_id() {
        return team_id;
    }

    public void setTeam_id(String team_id) {
        this.team_id = team_id;
    }

    public String getMember1() {
        return member1;
    }

    public void setMember1(String member1) {
        this.member1 = member1;
    }

    public String getMember2() {
        return member2;
    }

    public void setMember2(String member2) {
        this.member2 = member2;
    }

    public String getMember3() {
        return member3;
    }

    public void setMember3(String member3) {
        this.member3 = member3;
    }

    public String getMember4() {
        return member4;
    }

    public void setMember4(String member4) {
        this.member4 = member4;
    }

    public Team(){};
    public Team(String team_id, String member1,String member2, String member3, String member4){
        this.team_id = team_id;
        this.member1 = member1;
        this.member2 = member2;
        this.member3 = member3;
        this.member4 = member4;
    }
}
