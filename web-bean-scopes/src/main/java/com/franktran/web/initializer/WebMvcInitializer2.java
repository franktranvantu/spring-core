package com.franktran.web.initializer;

import com.franktran.web.config.WebMvcConfig2;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebMvcInitializer2 implements WebApplicationInitializer {


  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
    webApplicationContext.register(WebMvcConfig2.class);

    DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

    ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("dispatcherServlet2", dispatcherServlet);
    servletRegistration.setLoadOnStartup(2);
    servletRegistration.addMapping("/application2/*");
  }
}
