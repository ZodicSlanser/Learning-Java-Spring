package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O2_initialization;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Lazy
@Primary
class B {
    private final A classA;

    public B(A classA) {
        System.out.println("Class B Constructor");
        this.classA = classA;
        System.out.println(this.classA);
        System.out.println("has B in A been set ? " + (classA.getB() == null? "No" : "Yes"));
    }

    public static void greetB() {
        System.out.println("Hi there From B Class");
    }

    @Override
    public String toString() {
        return "Class B Has been printed";
    }


}
