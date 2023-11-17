package com.coding_test_week_4.repository;

import java.util.ArrayList;
import java.util.List;

import com.coding_test_week_4.entity.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {
	List<Employee> employees = new ArrayList<>();

	public List<Employee> findAllSalaryMore() {

		List<Employee> highPayedEmp = new ArrayList<>();

		for (Employee e : employees) {
			if (e.getSalary() > 40000) {
				highPayedEmp.add(e);
			}
		}
		return highPayedEmp;
	}

	public List<Employee> incrementSalary() {

		List<Employee> incrementedList = new ArrayList<>();

		for (Employee e : employees) {
			if (e.getSalary() > 50000) {
				double salary = e.getSalary() * 1.1;
				e.setSalary(salary);

				incrementedList.add(e);
			}
		}
		return incrementedList;
	}

	@Override
	public void addEmployee(Employee e) {
		employees.add(e);

	}

	@Override
	public List<Employee> display() {
		return employees;
	}

}
