package com.franktran.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfig {

  private final String host;
  private final String username;
  private final String password;

  public DataSourceConfig(
          @Value("${host}") String host,
          @Value("${user}") String username,
          @Value("${password}") String password) {
    this.host = host;
    this.username = username;
    this.password = password;
  }

  @Bean
  public DataSource dataSource() {
    String URL = String.format("jdbc:mysql://%s:3306/spring_core", host);
    BasicDataSource dataSource = new BasicDataSource();
    dataSource.setUrl(URL);
    dataSource.setUsername(username);
    dataSource.setPassword(password);
    return dataSource;
  }
}
