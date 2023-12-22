package com.entity;

public class Constellations {
    private String constellation_id;
    private String character_id;
    private String name;
    private String icon;

    public Constellations(){};

    public Constellations(String constellation_id, String character_id, String name, String icon){
        this.constellation_id = constellation_id;
        this.character_id = character_id;
        this.name = name;
        this.icon = icon;
    };

    public String getConstellation_id() {
        return constellation_id;
    }

    public void setConstellation_id(String constellation_id) {
        this.constellation_id = constellation_id;
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
