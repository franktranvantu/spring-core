package com.franktran.lc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userRegistration") UserRegistrationDTO userRegistration) {
        return "user-registration-page";
    }

    @PostMapping("/process-registration")
    public String processRegister(@ModelAttribute("userRegistration") UserRegistrationDTO userRegistration) {
        return "registration-success";
    }
}
