package com.dao.impl;

import com.DBUtil.DBUtil;
import com.dao.UserCharacterDao;
import com.entity.user.User_character;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserCharacterDaoimpl implements UserCharacterDao {
    @Override
    public void add_characters(User_character user_character){
        DBUtil dbUtil = new DBUtil();
        String UserId = user_character.getUserId();
        String characterId = user_character.getCharacterId();
        String MaxIndex = dbUtil.getMaxIndex("User_character");
        String index = Integer.toString(Integer.parseInt(MaxIndex)+1);
        dbUtil.executeUpdate("insert into User_character(`index`, UserId, characterId) values('" + index + "','" + UserId + "','" + characterId + "')");
        dbUtil.close();
    }

    @Override
    public void remove_characters(User_character user_character){
        DBUtil dbUtil = new DBUtil();
        String UserId = user_character.getUserId();
        String characterId = user_character.getCharacterId();
        String index = dbUtil.getIndex("user_character", UserId, characterId);
        dbUtil.executeUpdate("delete from User_character where UserId = '" + UserId +"' and characterId = '" + characterId + "'");
        dbUtil.executeUpdate("update User_character set `index` = `index`-1 where `index` > '"+ index +"'");
        dbUtil.close();
    }

    @Override
    public List<User_character> getAll(String sql){
        List<User_character> user_characterList = new ArrayList<>();
        DBUtil dbUtil = new DBUtil();
        ResultSet rs = dbUtil.executeQuery(sql);
        String index, UserId, characterId;
        try {
            while (rs.next()){
                index = rs.getString(1);
                UserId = rs.getString(2);
                characterId = rs.getString(3);
                user_characterList.add(new User_character(index, UserId, characterId));
            }
            dbUtil.close();
            return user_characterList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {
            dbUtil.close();
            return user_characterList;
        }
    }
}
