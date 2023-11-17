package practiceinheritanceWithAbstract;

public abstract class MediaItem extends Item{
	private Integer runTime;
	
	

	public MediaItem(int idNo,String title,int noOFCopies,Integer runTime) {
		super(idNo,title,noOFCopies);
		this.runTime = runTime;
	}

	public int getRuntime() {
		return runTime;
	}

	public void setRuntime(int runtime) {
		this.runTime = runtime;
	}
	
	public void print() {
		super.print();
		System.out.println("Runtime is : "+runTime);
	}
	
	
	
}
