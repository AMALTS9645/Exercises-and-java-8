package practiceinheritance;

public class Item {
	
	private int idNo;
	private	String title;
	private int noOFCopies;
	
	
	
	
	public Item(int idNo, String title, int noOFCopies) {

		this.idNo = idNo;
		this.title = title;
		this.noOFCopies = noOFCopies;
	}
	

	public int getIdNo() {
		return idNo;
	}
	
	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getNoOFCopies() {
		return noOFCopies;
	}
	
	public void setNoOFCopies(int noOFCopies) {
		this.noOFCopies = noOFCopies;
	}
	
	public void print() {
		System.out.println("Item Id Number is: "+idNo);
		System.out.println("Item title is: "+title);
		System.out.println("Item Number of Copies is: "+noOFCopies);
	}
	
	
	public void checkIn() {
		System.out.println("Item Checked in");
	}
	public void checkOut() {
		System.out.println("Item Checked out");
	}
	public void addItem() {
		System.out.println("Item added");
	}
}
