package spring_dependency_injection;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	@Value("${brand}")
	private String brand;
	@Value("${model}")
	private String model;
	@Value("${ram}")
	private int ram;
	
//	@Autowired
	Scanner scan;
	
	
	public Laptop(){
		System.out.println("Laptop object created");

		
	}
	
	
	//dependency injection
//	@Autowired
//	@Qualifier("internet2")
	private InternetConnection connection;
	
	@Autowired
	public Laptop(Scanner scan) {
		super();
		System.out.println("Constructor injection");
		this.scan = scan;
	}

	@Autowired
	public void setInternetConnection(InternetConnection connection) {
		System.out.println("Setter injection");
		this.connection = connection;
	}
	

	public void browseInternet() {
		System.out.println("Trying to connect");
		connection.browse();
		System.out.println("Scanner from laptop enter the name:");
		String name = scan.nextLine();
		System.out.println("name from laptop:"+name);
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("ram: "+ram);
	}

}
