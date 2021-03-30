//package com.franktran.mvc.initializer;
//
//import com.franktran.mvc.config.DataSourceConfig;
//import com.franktran.mvc.config.JdbcConfig;
//import com.franktran.mvc.config.TransactionConfig;
//import com.franktran.mvc.config.WebMvcConfig;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//public class WebMvcInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//    @Override
//    protected Class<?>[] getRootConfigClasses() {
//        return new Class[] { DataSourceConfig.class, JdbcConfig.class, TransactionConfig.class };
//    }
//
//    @Override
//    protected Class<?>[] getServletConfigClasses() {
//        return new Class[] { WebMvcConfig.class };
//    }
//
//    @Override
//    protected String[] getServletMappings() {
//        return new String[] { "/webmvc/*" };
//    }
//}