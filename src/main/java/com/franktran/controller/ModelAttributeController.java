package com.franktran.controller;

import com.franktran.model.MyWebsite;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ModelAttributeController {

  @GetMapping("/test")
  public String test(@ModelAttribute("website") MyWebsite myWebsite) {

    return "my-website";
  }
}
