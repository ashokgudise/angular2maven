package com.angular2.seed.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by ashokgudise on 5/26/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages =
            { "com.angular2.seed",
                    "com.angular2.seed.web.config",
                            "com.angular2.seed.service",
                                "com.angular2.seed.util",
                                        "com.angular2.seed.web.config.controller"})
public class AppConfig extends WebMvcConfigurerAdapter{

    // equivalents for <mvc:resources/> tags
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    // equivalent for <mvc:default-servlet-handler/> tag
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
