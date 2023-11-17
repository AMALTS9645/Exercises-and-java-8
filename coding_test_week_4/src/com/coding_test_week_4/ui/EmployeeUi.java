package com.coding_test_week_4.ui;

import java.util.List;
import java.util.Scanner;

import com.coding_test_week_4.entity.Employee;
import com.coding_test_week_4.service.EmployeeService;
import com.coding_test_week_4.service.EmployeeServiceImpl;

public class EmployeeUi {
	static Scanner scan = new Scanner(System.in);
	static EmployeeService service = new EmployeeServiceImpl();

	public static void addEmployee() {
		System.out.println("Enter the number of employees: ");
		int size = scan.nextInt();

		for (int i = 0; i < size; i++) {
			System.out.println("Enter Employee details : ");
			System.out.print("ID : ");
			long id = scan.nextInt();
			System.out.print("Name : ");
			String name = scan.next() + scan.nextLine();
			System.out.print("salary : ");
			double salary = scan.nextDouble();

			Employee e = new Employee(id, name, salary);

			service.addEmployee(e);
			System.out.println("Employee added:" + e);
		}
	}

	public static void findAllSalaryMore() {
		List<Employee> employees = service.findAllSalaryMore();
		if (employees.isEmpty()) {
			System.out.println("all employees are having salary less than 40000");
		} else {
			System.out.println("Employees with Salary more than 40000: ");
			for (Employee e : employees) {
				System.out.println(e);
			}

		}

	}

	public static void incrementSalary() {
		List<Employee> salaryIncremented = service.incrementSalary();
		if (salaryIncremented.isEmpty()) {

			System.out.println("No salary increment");
		} else {
			System.out.println("Salary Incremented Employees are: ");
		}
		for (Employee e : salaryIncremented) {
			System.out.println(e);

		}

	}

	public static void display() {
		List<Employee> employeesDisplay = service.display();
		System.out.println("Employees are: ");
		for (Employee e : employeesDisplay) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {

		
		try {
			addEmployee();
			display();
			findAllSalaryMore();
			incrementSalary();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}finally {
			scan.close();
		}

	}

	
}
