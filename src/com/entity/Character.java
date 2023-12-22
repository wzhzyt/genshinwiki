package com.entity;

public class Character {
    private String id;
    private String name;
    private String element;
    private String weapon;
    private String rank;
    private String region;
    private String icon;

    public Character(){}

    public Character(String id,String name,String element,String weapon,String rank,String region,String icon){
        this.id = id;
        this.name = name;
        this.element = element;
        this.weapon = weapon;
        this.rank = rank;
        this.region = region;
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
