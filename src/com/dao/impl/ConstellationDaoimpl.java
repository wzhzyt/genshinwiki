package com.dao.impl;

import com.DBUtil.DBUtil;
import com.dao.ConstellationDao;
import com.entity.Constellations;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConstellationDaoimpl implements ConstellationDao {
    @Override
    public List<Constellations> getAll(String sql){
        List<Constellations> constellationsList = new ArrayList<>();
        DBUtil dbUtil = new DBUtil();
        ResultSet rs = dbUtil.executeQuery(sql);
        String constellation_id, character_id, name, icon;
        try{
            while (rs.next()){
                constellation_id = rs.getString(1);
                character_id = rs.getString(2);
                name = rs.getString(3);
                icon = rs.getString(4);
                constellationsList.add(new Constellations(constellation_id,character_id,name,icon));
            }
            dbUtil.close();
            return constellationsList;
        }catch (SQLException e){
            throw  new RuntimeException(e);
        }finally {
            dbUtil.close();
            return constellationsList;
        }
    }
}
