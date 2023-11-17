package com.customerapp.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.customerapp"})
public class AppConfig {
//	bean - object
//	IOC container
	@Bean
	public Scanner getScanner() {
		return new Scanner(System.in);
	}

}


//Dependency Injection

