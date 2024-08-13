package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O6_XML_configuration;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XMLLauncher {
    public static void main(String[] args) {
        try(var context = new ClassPathXmlApplicationContext("XMLConfiguration.xml")){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
