package spring_dependency_injection;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"spring_dependency_injection"})
@PropertySource("app.properties")
public class AppConfig {
//	bean - object
//	IOC container
	@Bean
	public Scanner getScannerBean() {
		return new Scanner(System.in);
	}
	
//	@Bean("laptop2")
//	public Laptop getLaptopBean() {
//		return new Laptop();
//	}
//	
//	@Bean("internet2")
//	public InternetConnection getInternetBean() {
//		return new InternetConnection();
//	}

}


//Dependency Injection

