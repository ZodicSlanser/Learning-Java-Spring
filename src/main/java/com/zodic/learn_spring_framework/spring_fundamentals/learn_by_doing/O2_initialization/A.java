package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O2_initialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
class A {

    public B classB;

    public A() {
        System.out.println("Class A Constructor");
    }

    public static void greetA() {
        System.out.println("Hi there From A Class");
    }

    @Bean
    public B getB() {
        return this.classB;
    }

    @Bean
    private B setB(@Autowired B classB) {
        this.classB = classB;
        System.out.println("Class B in A has been set");
        return classB;

    }

    @Override
    public String toString() {
        return "Class A Has been Printed";
    }

}
