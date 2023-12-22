package com.entity;

public class Admin {
    private String UserId;
    private String UserName;
    private String PassWord;
    public  Admin(){}
    public Admin(String UserId, String UserName, String PassWord) {
        this.UserId = UserId;
        this.UserName = UserName;
        this.PassWord = PassWord;
    }
    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getUserId() {
        return UserId;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassWord() {
        return PassWord;
    }




}



