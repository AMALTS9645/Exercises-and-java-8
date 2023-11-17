package com.coding_test_week_4.service;

import java.util.List;

import com.coding_test_week_4.entity.Employee;
import com.coding_test_week_4.exception.InvalidInputException;
import com.coding_test_week_4.repository.EmployeeRepo;
import com.coding_test_week_4.repository.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepo repo = new EmployeeRepoImpl();

	@Override
	public List<Employee> findAllSalaryMore() {
		return repo.findAllSalaryMore();
	}

	@Override
	public List<Employee> incrementSalary() {
		return repo.incrementSalary();
	}

	@Override
	public void addEmployee(Employee e) {
		if (e.getEmployeeId() > 0 && (e.getEmployeeId() >= 10000 && e.getEmployeeId() <= 99999)) {
			if (e.getEmployeeName().length() > 3) {
				if (e.getSalary() >= 10000 && e.getSalary() <= 200000) {
					repo.addEmployee(e);
				} else {
					throw new InvalidInputException("Salary should be more than 10,000 and less than 2,00,000 ");
				}
			} else {
				throw new InvalidInputException("Name should have minimum 3 character");
			}
		} else {
			throw new InvalidInputException("Id should be a 5 digit positive no");
		}

	}

	@Override
	public List<Employee> display() {
		return repo.display();
	}

}
