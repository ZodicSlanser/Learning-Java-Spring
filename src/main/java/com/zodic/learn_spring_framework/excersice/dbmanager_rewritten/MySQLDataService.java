package com.zodic.learn_spring_framework.excersice.dbmanager_rewritten;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

//@Component
@Qualifier("MySQL")
@Repository
public class MySQLDataService implements DatabaseService {
    @Override
    public int[] retrieveData() {
        return new int[]{1, 2, 3, 4, 5};
    }
}
