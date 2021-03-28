package com.franktran.web.initializer;

import com.franktran.web.config.WebMvcConfig1;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebMvcInitializer1 implements WebApplicationInitializer {


  @Override
  public void onStartup(ServletContext servletContext) throws ServletException {
    AnnotationConfigWebApplicationContext webApplicationContext = new AnnotationConfigWebApplicationContext();
    webApplicationContext.register(WebMvcConfig1.class);

    DispatcherServlet dispatcherServlet = new DispatcherServlet(webApplicationContext);

    ServletRegistration.Dynamic servletRegistration = servletContext.addServlet("dispatcherServlet1", dispatcherServlet);
    servletRegistration.setLoadOnStartup(1);
    servletRegistration.addMapping("/application1/*");
  }
}
