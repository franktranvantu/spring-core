package com.franktran.web.controller;

import com.franktran.web.model.ApplicationBean;
import com.franktran.web.model.SingletonBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app1")
public class TestController1 {

  @Autowired
  private ApplicationBean applicationBean;
  @Autowired
  private SingletonBean singletonBean;

  @GetMapping("/change-default-value")
  @ResponseBody
  public String test() {
    applicationBean.setNo(5);
    singletonBean.setNo(5);
    return String.format("App1: applicationBean %s, singletonBean: %s", applicationBean.getNo(), singletonBean.getNo());
  }
}
