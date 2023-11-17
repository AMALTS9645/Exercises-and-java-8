package employeemanagewithstream;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee(1001, "Mohith", 43000);
		Employee e2 = new Employee(1002, "Harsh", 33000);
		Employee e3 = new Employee(1003, "Pankaj", 53000);
		Employee e4 = new Employee(1004, "Navin", 61000);
		Employee e5 = new Employee(1005, "Javed", 35000);
		List<Employee> emps = List.of(e1, e2, e3, e4, e5);

		// employees with salary more than 40000
		List<Employee> output = emps.stream().filter(e -> e.getSalary() >= 40000).collect(Collectors.toList());

		output.forEach(e -> System.out.println(e));
		// increase salary of employee by 10% where salary is more than 50000
		System.out.println("After increment_______________________________________________________");
		List<Employee> outputs = emps.stream().filter(e -> e.getSalary() >= 50000).map(e -> {
			e.setSalary(e.getSalary() * 1.10);
			return e;
		}).collect(Collectors.toList());

		outputs.forEach(e -> System.out.println(e));

		// Convert all the employee name to uppercase
		System.out.println("After converting names to uppercase. _______________________________________________");
		emps.stream().map(e -> {
			e.setEmployeeName(e.getEmployeeName().toUpperCase());
			return e;
		}).forEach(e -> System.out.println(e));

	}

}
