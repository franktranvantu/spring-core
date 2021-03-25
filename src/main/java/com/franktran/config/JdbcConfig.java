package com.franktran.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("datasource.properties")
public class JdbcConfig {

  private final String host;
  private final String user;
  private final String password;

  public JdbcConfig(
          @Value("${host}") String host,
          @Value("${user}") String user,
          @Value("${password}") String password) {
    this.host = host;
    this.user = user;
    this.password = password;
  }

  @Bean
  public DriverManagerDataSource dataSource() {
    String URL = String.format("jdbc:mysql://%s:3306/spring_core", host);

    return new DriverManagerDataSource(URL, user, password);
  }

  @Bean
  public JdbcTemplate jdbcTemplate() {
    return new JdbcTemplate(dataSource());
  }
}
