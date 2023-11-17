package employeeSort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		Employee e1 = new Employee(101,"amal",(double)70000,"kottayam");
		Employee e2 = new Employee(102,"anson",(double)40000,"eranakulam");
		Employee e3 = new Employee(103,"nawal",(double)10000,"palakkad");
		Employee e4 = new Employee(104,"akhila",(double)80000,"malappuram");
		Employee e5 = new Employee(105,"rejin",(double)30000,"kottayam");
		Employee e6 = new Employee(106,"rohith",(double)80000,"kasargod");
	
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		List<Employee> salarySort = list.stream().sorted((emp1,emp2)->emp1.getSalary().compareTo(emp2.getSalary())).collect(Collectors.toList());
		System.out.println("Sorted employees based on salary \n");
		System.out.println(salarySort);
		
		
		
		List<Employee> citySort = list.stream().sorted((emps1,emps2)->{if(emps1.getCity().equalsIgnoreCase(emps2.getCity())) {
			return emps1.getEmployeeName().compareTo(emps2.getEmployeeName());
		}else{
			return emps1.getCity().compareTo(emps2.getCity());
		}}).collect(Collectors.toList());
		System.out.println("\nSort employees based on citis\r\n" + 
				"(If two employee belong to same city sort based on name)\n");
		System.out.println(citySort);
		
		
		List<Employee> particularCity = list.stream().filter(e->e.getCity().equalsIgnoreCase("kottayam")).collect(Collectors.toList());
		System.out.println("\nFind employees belong to a particular city: \n");
		System.out.println(particularCity);
		
		
		
		Map<String,Integer> countCity = new HashMap<>();
		for(Employee e: list) {
			if(countCity.containsKey(e.getCity())) {
				countCity.put(e.getCity(),countCity.get(e.getCity()) + 1);
			}else {
				countCity.put(e.getCity(),1);
			}
		}
		System.out.println("\nCount the no of employees in each city:\n");
		System.out.println(countCity);

	}

}
