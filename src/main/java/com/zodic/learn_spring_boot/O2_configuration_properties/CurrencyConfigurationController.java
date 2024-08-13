package com.zodic.learn_spring_boot.O2_configuration_properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyConfigurationController {

    @Autowired
    CurrencyConfigurationService currencyService;

    @RequestMapping("/currency-configuration")
    public CurrencyConfigurationService getCurrency(){
        System.out.println("HERE");
        return currencyService;

    }
}
