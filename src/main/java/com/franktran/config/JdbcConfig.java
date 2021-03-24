package com.franktran.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class JdbcConfig {

  @Bean
  public DriverManagerDataSource dataSource() {
    String URL = "jdbc:mysql://localhost:3306/spring_jdbc";
    String USER = "frank";
    String PASSWORD = "frank";

    return new DriverManagerDataSource(URL, USER, PASSWORD);
  }
}
