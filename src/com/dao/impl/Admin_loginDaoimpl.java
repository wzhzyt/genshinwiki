package com.dao.impl;
import java.sql.ResultSet;
import com.DBUtil.DBUtil;
import com.dao.Admin_loginDao;
import java.sql.SQLException;


public class Admin_loginDaoimpl implements Admin_loginDao {
    @Override
    public boolean login(String UserId, String PassWord){
        DBUtil dbUtil = new DBUtil();
        ResultSet rs = dbUtil.executeQuery("SELECT * FROM Admin WHERE UserId = '" + UserId + "' AND PassWord = '" + PassWord + "'");

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
}
