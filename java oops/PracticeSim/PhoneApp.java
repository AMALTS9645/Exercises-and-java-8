package PracticeSim;

public class PhoneApp {
	public static void main(String []args) {
		
		Phone myPhone = new Phone();
		
		AirtelSim airtel = new AirtelSim();
		
		Sim jio = new JioSim();
		
//		myPhone.insertSim(airtel);
		myPhone.insertSim(jio);
		myPhone.makeACall();

	}

}
