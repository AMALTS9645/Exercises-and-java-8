package dateemployeecompare;

import java.time.LocalDate;

public class Employee {
	private long employeeId;
	private String employeeName;
	private double salary;
	private LocalDate hiredDate;

	public Employee(long employeeId, String employeeName, double salary, LocalDate hiredDate) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.hiredDate = hiredDate;
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(LocalDate hiredDate) {
		this.hiredDate = hiredDate;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", hiredDate=" + hiredDate + "]";
	}

}
