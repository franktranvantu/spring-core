package com.franktran.lc;

public class UserInfoDTO {

    private String name = "Frank";
    private String crushName = "Franky";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrushName() {
        return crushName;
    }

    public void setCrushName(String crushName) {
        this.crushName = crushName;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "name='" + name + '\'' +
                ", crushName='" + crushName + '\'' +
                '}';
    }
}
