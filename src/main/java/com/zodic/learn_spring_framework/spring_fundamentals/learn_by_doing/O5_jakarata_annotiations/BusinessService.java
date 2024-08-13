package com.zodic.learn_spring_framework.spring_fundamentals.learn_by_doing.O5_jakarata_annotiations;


import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Named // == @Component
public class BusinessService {
    private DataService dataService;


    public DataService getDataService() {
        return dataService;
    }

    @Inject // == @Autowired
    public void setDataService(DataService dataService) {
        System.out.println("Setter Injection");
        this.dataService = dataService;
    }

    public void printBean(Object object){
        System.out.println(object.toString());
    }
}
