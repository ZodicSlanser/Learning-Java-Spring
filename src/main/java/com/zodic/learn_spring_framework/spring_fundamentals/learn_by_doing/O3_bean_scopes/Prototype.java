package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O3_bean_scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Prototype {

    final public int ID = (int)(Math.random() * 100);
    public static int Password = (int)(Math.random() * 100) ;
    Prototype(){
        System.out.println("I am a Prototype Class here's my ID: " + ID + '\n' + "our static password is: " + Password );
    }


}
