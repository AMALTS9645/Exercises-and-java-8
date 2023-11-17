package interfacePractice;

public class Phone {
	Sim sim;
	
	public void insertSim(Sim sim) {
		this.sim=sim;
	}
	
	public void makeACall(){
		sim.call();
	}


}
