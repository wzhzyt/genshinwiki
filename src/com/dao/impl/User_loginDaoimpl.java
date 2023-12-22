package com.dao.impl;

import com.DBUtil.DBUtil;
import com.dao.User_loginDao;
import com.entity.user.User;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User_loginDaoimpl implements User_loginDao {
    @Override
    public boolean login(String UserId, String PassWord){
        DBUtil dbUtil = new DBUtil();
        ResultSet rs = dbUtil.executeQuery("SELECT * FROM User WHERE UserId = '" + UserId + "' AND PassWord = '" + PassWord + "'");

        try{
            if(rs.next()){
                return true;
            }else {
                return false;
            }
        }catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            dbUtil.close();
        }
    }

    @Override
    public void createAccount(User user){
        DBUtil dbUtil = new DBUtil();
        String UserId = user.getUserId();
        String Password = user.getPassWord();
        String name = user.getUserName();
        dbUtil.executeUpdate("insert into user(UserId, Password, name) values('" + UserId + "', '" + Password + "', '" + name + "')");
        dbUtil.close();
    }
}