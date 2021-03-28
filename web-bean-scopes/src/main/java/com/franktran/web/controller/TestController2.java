package com.franktran.web.controller;

import com.franktran.web.model.ApplicationBean;
import com.franktran.web.model.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app2")
public class TestController2 {

  @Autowired
  private ApplicationBean applicationBean;
  @Autowired
  private SingletonBean singletonBean;

  @GetMapping("/get-value")
  @ResponseBody
  public String test() {
    return String.format("App2: applicationBean %s, singletonBean: %s", applicationBean.getNo(), singletonBean.getNo());
  }
}
