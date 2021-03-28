package com.franktran.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class NormalController {

  @GetMapping("/normal")
  public String normal(HttpSession session) {
    String username = (String) session.getAttribute("username");
    String password = (String) session.getAttribute("password");
    System.out.println(username);
    System.out.println(password);
    return "users";
  }
}
