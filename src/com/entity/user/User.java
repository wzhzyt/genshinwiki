package com.entity.user;


public class User {
    private String UserId;
    private String UserName;
    private String PassWord;


    public  User(){};
    public  User(String UserId, String UserName, String PassWord){
        this.UserId = UserId;
        this.PassWord = PassWord;
        this.UserName = UserName;
    }

    public String getUserId() {
        return UserId;
    }

    public void setId(String Userid) {
        this.UserId = Userid;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String password) {
        PassWord = password;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String name) {
        this.UserName = name;
    }
}
