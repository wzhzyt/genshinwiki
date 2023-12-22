package com.dao.impl;
import com.DBUtil.DBUtil;
import com.dao.AdminDao;
import com.entity.Admin;
import com.entity.Character;
import com.entity.user.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDaoimpl implements AdminDao {

    @Override
    public void add_user(User user){
        DBUtil dbUtil = new DBUtil();
        String UserId = user.getUserId();
        String UserName = user.getUserName();
        String PassWord = user.getPassWord();

        dbUtil.executeUpdate("insert into User(UserId, UserName, PassWord) values('" + UserId + "','" + UserName + "','" + PassWord + "')");
        dbUtil.close();
    }

    @Override
    public void modify_user(User user) {
        DBUtil dbUtil = new DBUtil();
        String UserId = user.getUserId();
        String PassWord = user.getPassWord();

            dbUtil.executeUpdate("update User set PassWord = '" + PassWord + "' where UserId = '" + UserId + "'");
        dbUtil.close();
    }

    @Override
    public void remove_user(String UserId) {
        DBUtil dbUtil = new DBUtil();
        dbUtil.executeUpdate("delete from User where UserId = '" + UserId + "'");
        dbUtil.close();
    }


    @Override
    public List<User> getAll_user(String sql) {
        List<User> userList= new ArrayList<>();
        DBUtil dbUtil = new DBUtil();
        ResultSet rs = dbUtil.executeQuery(sql);
        String UserId, UserName, PassWord;
        try {
            while (rs.next()){
                UserId = rs.getString(1);
                UserName = rs.getString(2);
                PassWord = rs.getString(3);
                userList.add(new User(UserId,UserName,PassWord));
            }
            dbUtil.close();
            return userList;
        }catch (SQLException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        finally {
            {
                dbUtil.close();
                return userList;
            }
        }
    }

    @Override
    public void add_character(Character character){
        DBUtil dbUtil = new DBUtil();
        String Id = character.getId();
        String Name = character.getName();
        String Element = character.getElement();
        String Weapon = character.getWeapon();
        String Rank = character.getRank();
        String Region = character.getRegion();
        String Icon = character.getIcon();

        dbUtil.executeUpdate("insert into Characters(id, name, element, weapon, `rank`, region, icon) values('" + Id + "','" + Name + "','" + Element + "','" + Weapon +"','" + Rank + "','" + Region + "','" + Icon + "')");
        dbUtil.close();
    }

    @Override
    public  void  modify_character(Character character){
        DBUtil dbUtil = new DBUtil();
        String Id = character.getId();
        String Name = character.getName();
        String Element = character.getElement();
        String Weapon = character.getWeapon();
        String Rank = character.getRank();
        String Region = character.getRegion();
        String Icon = character.getIcon();
        dbUtil.executeUpdate("update characters set name = '" + Name + "', element = '" + Element +"', weapon = '" + Weapon + "', `rank` = '" + Rank + "', region = '" + Region + "', icon = '" + Icon + "' where id ='" + Id + "'");
        dbUtil.close();
    }
    @Override
    public void remove_character(String Id) {
        DBUtil dbUtil = new DBUtil();
        dbUtil.executeUpdate("delete from Characters where id = '" + Id + "'");
        dbUtil.close();
    }
}
