package inheritance;

public class FuelEngine extends CarBase {
	int engineCc;
	
	
	
	public void refillFuel() {
		System.out.println("fuel refilling");
	}
	
	public void showCar() {
		super.showCar();
		System.out.println("engine CC : " + engineCc);
	}
}
