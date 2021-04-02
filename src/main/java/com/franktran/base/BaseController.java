package com.franktran.base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
