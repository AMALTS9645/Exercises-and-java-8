package inheritance;

public class MyCarMain {

	public static void main(String[] args) {
		CarBase car = new EV();
		
		car.color = "Red";
		car.start();
		
		car.model = "wagonr";
		car.regNo = "KL05AT531";
//		car.engineCc = 150;
		
		car.showCar();
		
		car.stop();

	}

}


//private members can't be inherited
//this keyword and super cant be written inside static method