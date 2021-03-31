package com.franktran.lc;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

public class UserInfoDTO {

    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, max = 15, message = "Name must be between 3-15 characters")
    private String name;

    @NotBlank(message = "Crush name cannot be blank")
    @Size(min = 3, max = 15, message = "Crush name must be between 3-15 characters")
    private String crushName;

    @AssertTrue(message = "You have to agree to use our app")
    private boolean termAndCondition;

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

    public boolean isTermAndCondition() {
        return termAndCondition;
    }

    public void setTermAndCondition(boolean termAndCondition) {
        this.termAndCondition = termAndCondition;
    }
}
