package com.franktran.web.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionBean {

  public SessionBean() {
    System.out.println("SessionBean()");
  }

  private String websiteName = "franktran.com";

  public String getWebsiteName() {
    return websiteName;
  }

  public void setWebsiteName(String websiteName) {
    this.websiteName = websiteName;
  }
}
