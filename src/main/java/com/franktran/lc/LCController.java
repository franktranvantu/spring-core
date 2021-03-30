package com.franktran.lc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LCController {

    @GetMapping
    public String showHomePage() {
        return "home-page";
    }
}
