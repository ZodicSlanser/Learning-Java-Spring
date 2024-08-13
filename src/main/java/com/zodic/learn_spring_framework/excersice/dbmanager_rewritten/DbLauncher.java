package com.zodic.learn_spring_framework.excersice.dbmanager.dbmanager_rewritten;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.zodic.learn_spring_framework.excersice.dbmanager")
public class DbLauncher {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(DbLauncher.class)) {
            var db = context.getBean(BusinessHandlingService.class);
            System.out.println("Max Result in: " + db.getDBType() + " is: " + db.findMax());

        }
    }
}
