package inheritance;

public class EV extends CarBase{
	
	private double batteryCapacity;
	
	public void chargeBattery() {
		System.out.println("Battery Charging");
	}
	
	public void stop() {
		System.out.println("Ev stopped");
	}
	
	public void showCar() {
		super.showCar();
		System.out.println("Battery Capacity : " + batteryCapacity);
	}
}
