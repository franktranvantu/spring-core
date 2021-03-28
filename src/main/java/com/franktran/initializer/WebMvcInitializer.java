package com.franktran.initializer;

import com.franktran.config.DataSourceConfig;
import com.franktran.config.JdbcConfig;
import com.franktran.config.TransactionConfig;
import com.franktran.config.WebMvcConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses()  {
        return new Class[] { DataSourceConfig.class, JdbcConfig.class, TransactionConfig.class };
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebMvcConfig.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}