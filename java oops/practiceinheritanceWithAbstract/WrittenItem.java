package practiceinheritanceWithAbstract;

public abstract class WrittenItem extends Item{
	private String author;
	

	public WrittenItem(int idNo,String title,int noOFCopies,String author) {
		super(idNo,title,noOFCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void print() {
		super.print();
		System.out.println("Author Name is : "+author);
	}
	
	
}
