package practiceinheritanceWithAbstract;

public class ItemMain {
	public static void main(String []args) {
		
		Item book = new Book(101,"abcd",10,"xyz");
		
		
		
		JournalPaper journal = new JournalPaper(102,"hgg",5,"svdv", "1998");
		
		
		Media media = new Media(103,"jhgkj",7,30, "hdajkch", ".dkuhv",1995);
		
		
		CD cd = new CD(104,"hbnc",9,87,"kjchdc","cdahcbdc");
		
		
		book.print();
		
		System.out.println("\n");
		
		journal.print();
		
		System.out.println("\n");
		
		media.print();
		
		System.out.println("\n");
		
		cd.print();
		
		book.checkIn();
		book.checkOut();
		
		
		System.out.println(book instanceof Object);
		System.out.println(book instanceof MediaItem);
		
		
	}
	
	
	
	
	
}
