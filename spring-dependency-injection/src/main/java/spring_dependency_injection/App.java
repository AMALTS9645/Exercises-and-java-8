package spring_dependency_injection;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Laptop laptop = context.getBean(Laptop.class);
		
		Scanner scan = context.getBean(Scanner.class);
		
		System.out.println("Enter your name:");
		String name = scan.nextLine();
		System.out.println("name :"+name);
		
		laptop.browseInternet();
	}
}
