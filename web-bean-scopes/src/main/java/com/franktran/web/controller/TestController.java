package com.franktran.web.controller;

import com.franktran.web.model.RequestBean;
import com.franktran.web.model.SessionBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class TestController {

  @Autowired
  private RequestBean requestBean;
  @Autowired
  private SessionBean sessionBean;

  @GetMapping("/request1")
  public void request1(HttpServletResponse response) throws IOException {
    requestBean.setWebsiteName("frank.net");
    response.getWriter().println(requestBean.getWebsiteName());
  }

  @GetMapping("/request2")
  public void request2(HttpServletResponse response) throws IOException {
    response.getWriter().println(requestBean.getWebsiteName());
  }

  @GetMapping("/session1")
  public void session1(HttpServletResponse response) throws IOException {
    sessionBean.setWebsiteName("frank.net");
    response.getWriter().println(sessionBean.getWebsiteName());
  }

  @GetMapping("/session2")
  public void session2(HttpServletResponse response) throws IOException {
    response.getWriter().println(sessionBean.getWebsiteName());
  }
}
