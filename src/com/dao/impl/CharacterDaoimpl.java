package com.dao.impl;

import com.DBUtil.DBUtil;
import com.dao.CharacterDao;
import com.entity.Character;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CharacterDaoimpl implements CharacterDao {
    @Override
    public List<Character> getAll(String sql){
        List<Character> characterList = new ArrayList<>();
        DBUtil dbUtil = new DBUtil();
        ResultSet rs = dbUtil.executeQuery(sql);
        String id, name, element, weapon, rank, region, icon;
        try {
            while (rs.next()){
                id = rs.getString(1);
                name = rs.getString(2);
                element =rs.getString(3);
                weapon = rs.getString(4);
                rank = rs.getString(5);
                region = rs.getString(6);
                icon = rs.getString(7);
                characterList.add(new Character(id, name, element, weapon, rank, region, icon));
            }
            dbUtil.close();
            return  characterList;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        finally {
            dbUtil.close();
            return  characterList;
        }
    }
    @Override
    public List<Character> search(String sql){
        List<Character> characterList = new ArrayList<>();
        DBUtil dbUtil = new DBUtil();
        ResultSet rs = dbUtil.executeQuery(sql);
        String id, name, element, weapon, rank, region, icon;
        try {
            while (rs.next()){
                id = rs.getString(1);
                name = rs.getString(2);
                element =rs.getString(3);
                weapon = rs.getString(4);
                rank = rs.getString(5);
                region = rs.getString(6);
                icon = rs.getString(7);
                characterList.add(new Character(id, name, element, weapon, rank, region, icon));
            }
            dbUtil.close();
            return  characterList;
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        finally {
            dbUtil.close();
            return  characterList;
        }
    }
}
