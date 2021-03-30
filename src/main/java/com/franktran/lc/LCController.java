package com.franktran.lc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class LCController {

    @GetMapping
    public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
        return "/home-page";
    }

    @GetMapping("/process-homepage")
    public String processHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
        return "result-page";
    }
}
