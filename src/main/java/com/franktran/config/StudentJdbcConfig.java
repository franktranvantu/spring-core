package com.franktran.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration
public class StudentJdbcConfig {

    private final DataSourceConfig dataSourceConfig;

    public StudentJdbcConfig(DataSourceConfig dataSourceConfig) {
        this.dataSourceConfig = dataSourceConfig;
    }

    @Bean
    public SimpleJdbcInsert studentJdbcInsert() {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(dataSourceConfig.dataSource())
                .withTableName("student")
                .usingGeneratedKeyColumns("id");
        return jdbcInsert;
    }
}
