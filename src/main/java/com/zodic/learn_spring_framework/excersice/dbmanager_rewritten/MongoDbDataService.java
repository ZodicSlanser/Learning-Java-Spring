package com.zodic.learn_spring_framework.excersice.dbmanager_rewritten;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Component
@Primary
@Qualifier("MongoDB")
@Repository
public class MongoDbDataService implements DatabaseService {
    @Override
    public int[] retrieveData() {
        return new int[]{11, 22, 33, 44, 55};
    }
}
