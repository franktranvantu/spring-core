package com.franktran.controller;

import com.franktran.model.MyWebsite;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@ControllerAdvice(assignableTypes = ModelAttributeController.class)
@SessionAttributes("website")
public class MyWebsiteController {

  @ModelAttribute("website")
  public MyWebsite myWebsite() {
    MyWebsite myWebsite = new MyWebsite("franktran.com", "spring");
    System.out.println(myWebsite.hashCode());
    return myWebsite;
  }

  @GetMapping("/show-website-info")
  public String showWebsiteInfo(@ModelAttribute("website") MyWebsite website) {
    return "my-website";
  }

  @GetMapping("/show-company-info")
  public String showCompanyInfo(@ModelAttribute("website") MyWebsite myWebsite) {
    return "my-website";
  }
}
