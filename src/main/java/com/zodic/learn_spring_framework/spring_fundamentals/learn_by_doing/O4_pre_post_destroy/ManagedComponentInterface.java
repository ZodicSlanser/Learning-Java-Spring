package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O4_pre_post_destroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public interface ManagedComponentInterface {

    @PostConstruct
    void initialization();

    @PreDestroy
    void cleanup();
}
