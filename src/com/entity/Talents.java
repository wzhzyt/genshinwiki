package com.entity;

public class Talents {
    private String talent_id;
    private String character_id;
    private String name;
    private String icon;

    public Talents(){};
    public Talents(String talent_id, String character_id, String name, String icon){
        this.talent_id = talent_id;
        this.character_id = character_id;
        this.name = name;
        this.icon = icon;
    }

    public String getTalent_id() {
        return talent_id;
    }

    public void setTalent_id(String talent_id) {
        this.talent_id = talent_id;
    }

    public String getCharacter_id() {
        return character_id;
    }

    public void setCharacter_id(String character_id) {
        this.character_id = character_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
