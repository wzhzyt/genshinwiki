package com.dao;

import com.entity.user.User;

public interface User_loginDao {
    boolean login(String UserId, String PassWord);
    void createAccount(User user);
}
