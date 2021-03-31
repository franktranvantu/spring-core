package com.franktran.lc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.franktran.lc")
public class LCWebConfig implements WebMvcConfigurer {

    private final PhoneFormatter phoneFormatter;

    public LCWebConfig(PhoneFormatter phoneFormatter) {
        this.phoneFormatter = phoneFormatter;
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/lc/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(phoneFormatter);
    }
}
