package encapsulation;

public class Car {
	private String model;
	private String color;
	private String regNo;
	
	
	public Car() {
		super();
	}



	public Car(String model, String color, String regNo) {
		super();
		this.model = model;
		this.color = color;
		this.regNo = regNo;
	}



	public void start() {
		System.out.println("Car started");
	}
	
	
	
	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getRegNo() {
		return regNo;
	}



	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}



	public void showCarInfo() {
		System.out.println("The car model is: " + model);
		System.out.println("The car color is: " +color);
		System.out.println("The car register number is: "+regNo);
		
	}
}
