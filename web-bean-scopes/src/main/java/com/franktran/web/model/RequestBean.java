package com.franktran.web.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;

@Component
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequestScope
public class RequestBean {

  public RequestBean() {
    System.out.println("RequestBean()");
  }

  private String websiteName = "franktran.com";

  public String getWebsiteName() {
    return websiteName;
  }

  public void setWebsiteName(String websiteName) {
    this.websiteName = websiteName;
  }
}
