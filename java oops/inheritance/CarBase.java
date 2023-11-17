package inheritance;

public class CarBase {

	protected String model;
	protected String color;
	protected String regNo;
	
	public void start() {
		System.out.println("Car started");
	}
	
	public void breaked() {
		System.out.println("Car breaked");
	}
	
	public void stop() {
		System.out.println("car stopped");
	}
	
	public void showCar() {
		System.out.println("Car model : " + model);
		System.out.println("Car color : " + color);
		System.out.println("Car regNo : " + regNo);
	}
}
