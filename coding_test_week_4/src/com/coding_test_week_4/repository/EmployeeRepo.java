package com.coding_test_week_4.repository;

import java.util.List;

import com.coding_test_week_4.entity.Employee;

public interface EmployeeRepo {
	public void addEmployee(Employee e);
	public List<Employee> findAllSalaryMore();
	public List<Employee> incrementSalary();
	public  List<Employee> display();
}
