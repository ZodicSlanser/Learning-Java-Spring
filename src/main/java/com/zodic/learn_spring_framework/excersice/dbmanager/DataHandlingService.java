package com.zodic.learn_spring_framework.excersice.dbmanager;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataHandlingService {
    DatabaseService db;

    //uncomment this to use the MongoDB Service
//        public BusinessHandlingService (DatabaseService db){
//        this.db = db;
//    }
    public DataHandlingService(@Qualifier("MySQL") DatabaseService db) {
        this.db = db;
    }

    public String getDBType() {
        return db.toString().split("\\.")[db.toString().split("\\.").length - 1].split("@")[0];
    }

    public int findMax() {
        return Arrays.stream(db.retrieveData()).max().orElse(0);
    }


}
