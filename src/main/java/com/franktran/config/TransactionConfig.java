package com.franktran.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class TransactionConfig {

  private final DataSourceConfig dataSourceConfig;

  public TransactionConfig(DataSourceConfig dataSourceConfig) {
    this.dataSourceConfig = dataSourceConfig;
  }

  @Bean
  public PlatformTransactionManager transactionManager() {
    return new DataSourceTransactionManager(dataSourceConfig.dataSource());
  }
}
