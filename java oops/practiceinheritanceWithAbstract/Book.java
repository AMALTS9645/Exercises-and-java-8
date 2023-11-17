package practiceinheritanceWithAbstract;

public class Book extends WrittenItem{
	
	

	public Book(int idNo,String title,int noOFCopies,String author) {
		super(idNo,title,noOFCopies,author);
	}
	
	public void print() {
		super.print();
	}
	
	public void checkIn() {
		System.out.println("Book Checked In");
	}
	public void checkOut() {
		System.out.println("Book Checked out");
	}
	public void addItem() {
		System.out.println("Book added");
	}
}
