package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O3_bean_scopes;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Tester {
    Normal normalClass;
    Prototype prototypeClass;

    Tester(Normal normalClass, Prototype prototypeClass) {
        this.normalClass = normalClass;
        this.prototypeClass = prototypeClass;
        System.out.println("+++++++++++++++++++++++++");
    }

    private String getNormal() {
        return normalClass.toString().split("\\.")[normalClass.toString().split("\\.").length - 1];
    }

    private String getPrototype() {
        return prototypeClass.toString().split("\\.")[prototypeClass.toString().split("\\.").length - 1];

    }

    public void getComponents(){
        System.out.println("this is the Tester Class");
        System.out.println("My Prototype Class is: " + getPrototype() + " its id is: " + this.prototypeClass.ID + " and it's password is " + this.prototypeClass.Password);
        System.out.println("My Normal Class is: " + getNormal() + " its id is: " + this.normalClass.ID + " and it's password is " + this.normalClass.Password);}
}
