package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O3_bean_scopes;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Normal {
    final public int ID = (int)(Math.random() * 100);
    public   int Password = (int)(Math.random() * 100) ;
    Normal(){
        System.out.println("I am a Normal Class here's my ID: " + ID + '\n' + "my static password is: " + Password );
    }
}
