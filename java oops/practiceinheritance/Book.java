package practiceinheritance;

public class Book extends WrittenItem{
	
	

	public Book(int idNo,String title,int noOFCopies,String author) {
		super(idNo,title,noOFCopies,author);
	}
	
	public void print() {
		super.print();
	}
}
