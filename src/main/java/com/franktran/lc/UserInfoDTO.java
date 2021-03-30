package com.franktran.lc;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Size;

public class UserInfoDTO {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 15, message = "Name must be between 3-15 characters")
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
