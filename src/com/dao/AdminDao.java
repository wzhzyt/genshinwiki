package com.dao;
import com.entity.Admin;
import com.entity.Character;
import com.entity.user.User;

import java.util.List;
public interface AdminDao {
    void add_user(User user);
    void modify_user(User user);
    void remove_user(String UserId);
    List<User> getAll_user(String sql);
    void add_character(Character character);
    void modify_character(Character character);
    void remove_character(String Id);
}
