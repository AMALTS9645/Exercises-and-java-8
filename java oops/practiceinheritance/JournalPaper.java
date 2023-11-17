package practiceinheritance;

public class JournalPaper extends WrittenItem{
	private String yop;
	
	

	public JournalPaper(int idNo,String title,int noOFCopies,String author, String yop) {
		super(idNo,title,noOFCopies,author);
		this.yop = yop;
	}

	public String getYop() {
		return yop;
	}

	public void setYop(String yop) {
		this.yop = yop;
	}
	
	public void print() {
		super.print();
		System.out.println("Year of publishing : "+yop);
	}
	
	
}
