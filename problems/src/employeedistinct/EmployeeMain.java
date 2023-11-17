package employeedistinct;

import java.util.ArrayList;
import java.util.List;


public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		Employee e1 = new Employee(101, "amal", (double) 70000, "kottayam");
		Employee e2 = new Employee(102, "anson", (double) 40000, "eranakulam");
		Employee e3 = new Employee(102, "anson", (double) 40000, "eranakulam");
		

		list.add(e1);
		list.add(e2);
		list.add(e3);


		list.stream().distinct().forEach(e->System.out.println(e));
	}

}
