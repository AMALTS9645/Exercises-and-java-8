package com.customerapp.ui;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.customerapp.config.AppConfig;
import com.customerapp.model.Customer;

import com.customerapp.service.CustomerServiceImpl;

public class CustomerAppUi {
	static Scanner scan;

	static CustomerServiceImpl service;
	

	public static void addCustomer() {

		

		System.out.println("Enter customer details : ");
		System.out.print("ID : ");
		int id = scan.nextInt();
		System.out.print("Name : ");
		String name = scan.next() + scan.nextLine();
		System.out.print("Email : ");
		String email = scan.next() + scan.nextLine();

		Customer c = new Customer(id, name, email);

		service.addCustomer(c);
		System.out.println("Customer added");

	}

	public static void GetCustomerByName() {
		System.out.println("Enter name of the customer : ");
		String name = scan.next() + scan.nextLine();
		Customer c = service.getCustomerByName(name);
		System.out.println(c);

	}

	public static void GetCustomerById() {
		System.out.println("Enter id of the customer : ");
		int id = scan.nextInt();
		Customer c = service.getCustomerById(id);
		System.out.println(c);

	}

	public static void DeleteCustomerById() {
		System.out.println("Enter id of the customer : ");
		int id = scan.nextInt();
		service.deleteCustomer(id);
		System.out.println("Customer deleted");

	}

	public static void GetAll() {
		List<Customer> customers = service.getAllCustomers();
		for (Customer c : customers) {
			System.out.println(c);
		}

	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		service = context.getBean(CustomerServiceImpl.class);
		
		scan = context.getBean(Scanner.class);
		
		while (true) {
			System.out.println("Enter Your Choice : ");
			System.out.println("1 : Add Customer: ");
			System.out.println("2 : Search Customer By Id: ");
			System.out.println("3 : Search Customer By Name: ");
			System.out.println("4 : Delete Customer By Id: ");
			System.out.println("5 : Get All Customers: ");
			System.out.println("0 : Exit");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				try {
					addCustomer();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2:
				try {

					GetCustomerById();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			case 3:
				try {
					GetCustomerByName();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			case 4:
				try {
					DeleteCustomerById();
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
				break;
			case 5:
				GetAll();
				break;
			case 0:
				System.out.println("Bye.....");
				System.exit(1);
				break;
			default:
				System.out.println("Unexpected value: " + choice);
				break;
			}
		}

	}

}
