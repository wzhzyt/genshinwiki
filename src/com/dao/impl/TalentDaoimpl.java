package com.dao.impl;

import com.DBUtil.DBUtil;
import com.dao.TalentDao;
import com.entity.Talents;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TalentDaoimpl implements TalentDao {
    @Override
    public List<Talents> getAll(String sql){
        List<Talents> talentList = new ArrayList<>();
        DBUtil dbUtil = new DBUtil();
        ResultSet rs = dbUtil.executeQuery(sql);
        String talent_id, character_id, name, icon;
        try{
            while(rs.next()){
                talent_id = rs.getString(1);
                character_id = rs.getString(2);
                name = rs.getString(3);
                icon = rs.getString(4);
                talentList.add(new Talents(talent_id, character_id, name, icon));
            }
            dbUtil.close();
            return talentList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            dbUtil.close();
            return talentList;
        }
    }
}
