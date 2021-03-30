package com.franktran.lc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.validation.Valid;
import java.util.List;

@Controller
public class LCController {

    @GetMapping
    public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
        return "/home-page";
    }

    @GetMapping("/process-homepage")
    public String processHomePage(@ModelAttribute("userInfo") @Valid UserInfoDTO userInfo, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "home-page";
        }
        return "result-page";
    }
}
