package com.dao;
import com.entity.user.User_character;

import java.util.List;

public interface UserCharacterDao {
    List<User_character> getAll(String sql);
    void add_characters(User_character user_character);
    void remove_characters(User_character user_character);
}
