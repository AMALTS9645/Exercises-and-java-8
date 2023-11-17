package practiceinheritanceWithAbstract;

public class CD extends MediaItem{

	private String artist;
	private String genre;
	
	public CD(int idNo,String title,int noOFCopies,Integer runTime,String artist,String genre) {
		super(idNo,title,noOFCopies,runTime);
		this.artist = artist;
		this.genre = genre;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void print() {
		super.print();
		System.out.println("Artist name is : "+artist);
		System.out.println("Genre is : "+genre);
	}
	
	public void checkIn() {
		System.out.println(" CD Checked In");
	}
	public void checkOut() {
		System.out.println("CD Checked out");
	}
	public void addItem() {
		System.out.println("CD added");
	}
	
}
