package com.franktran.web.config;

import com.franktran.web.controller.TestController1;
import com.franktran.web.model.ApplicationBean;
import com.franktran.web.model.SingletonBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {SingletonBean.class, ApplicationBean.class, TestController1.class})
public class WebMvcConfig1 implements WebMvcConfigurer {

}
