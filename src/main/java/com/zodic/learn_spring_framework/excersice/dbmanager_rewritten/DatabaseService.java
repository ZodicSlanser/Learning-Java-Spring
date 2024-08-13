package com.zodic.learn_spring_framework.excersice.dbmanager.dbmanager_rewritten;

import org.springframework.stereotype.Component;

@Component
public interface DatabaseService {
    int[] retrieveData();
}
