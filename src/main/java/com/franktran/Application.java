package com.franktran;

import com.franktran.config.JdbcConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    context.register(JdbcConfig.class);
  }
}
