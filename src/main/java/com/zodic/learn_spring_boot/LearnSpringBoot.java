package com.zodic.learn_spring_boot.O1_simple_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.zodic.learn_spring_boot" )
public class LearnSpringBoot {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBoot.class, args);
	}

}
