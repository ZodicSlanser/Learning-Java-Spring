package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O2_initialization;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HelloLazySpringConfiguration {
    @Bean
    public String greet() {
        return "*Yawn* Hello, Spring!";
    }

    @Bean
    public String farewell() {
        return "Goodbye, Spring!";
    }

}


