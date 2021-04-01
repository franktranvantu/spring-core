package com.franktran.lc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @GetMapping("/register")
    public String showRegistrationPage(@ModelAttribute("userRegistration") UserRegistrationDTO userRegistration) {
        return "user-registration-page";
    }

    @PostMapping("/process-registration")
    public String processRegister(@ModelAttribute("userRegistration") @Valid UserRegistrationDTO userRegistration, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "user-registration-page";
        }
        return "registration-success";
    }
}
