package com.example.app3.model;

public class Team {
    private int img;
    private String name;
    private String cityState;

    public Team() {
    }
    public Team(int img, String name, String cityState){
        this.img = img;
        this.name = name;
        this.cityState = cityState;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getCityState() {
        return cityState;
    }

    public void setCityState(String cityState) {
        this.cityState = cityState;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
