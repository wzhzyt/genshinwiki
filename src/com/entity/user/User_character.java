package com.entity.user;

public class User_character {
    private String index;
    private String UserId;
    private String characterId;
    public String getCharacterId() {
        return characterId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public User_character(String index, String UserId, String characterId){
        this.index = index;
        this.UserId = UserId;
        this.characterId = characterId;
    }
    public User_character(){}
}
