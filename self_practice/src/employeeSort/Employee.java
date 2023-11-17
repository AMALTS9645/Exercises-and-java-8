package employeeSort;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Double salary;
	private String city;
	
	public Employee(int employeeId,String employeeName,Double salary,String city){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.city = city;
	}
	
	public int getEmployeeId(){
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId){
		this.employeeId = employeeId;
	}
	
	public String getEmployeeName(){
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName){
		this.employeeName = employeeName;
	}
	
	public Double getSalary(){
		return salary;
	}
	
	public void setSalary(Double salary){
		this.salary = salary;
	}
	
	public String getCity(){
		return city;
	}
	
	public void setSalary(String city){
		this.city = city;
	}

	@Override
	public String toString() {
		return "employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary+ ", city=" + city+"\n";
	}
	
	
	
	
}
