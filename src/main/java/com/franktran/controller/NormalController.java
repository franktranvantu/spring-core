package com.franktran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

@Controller
public class NormalController {

  @GetMapping("/normal")
  public String normal(@SessionAttribute("username") String username, Model model) {
    System.out.println(username);
    return "users";
  }
}
