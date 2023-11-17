package employeedistinct;


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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + employeeId;
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (employeeId != other.employeeId)
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}
	
	
	
	
}

