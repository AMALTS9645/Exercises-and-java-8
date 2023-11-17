package practiceinheritanceWithAbstract;

public class Media extends MediaItem{
	private String director;
	private String genre;
	private int yor;
	
	
	public Media(int idNo,String title,int noOFCopies,Integer runTime, String director, String genre, int yor) {
		super(idNo,title,noOFCopies,runTime);
		this.director = director;
		this.genre = genre;
		this.yor = yor;
	}
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getYor() {
		return yor;
	}
	public void setYor(int yor) {
		this.yor = yor;
	}
	
	public void print() {
		super.print();
		System.out.println("Director Name is : "+director);
		System.out.println("Genre Name is : "+genre);
		System.out.println("Year of Release is : "+yor);
	}
	
	public void checkIn() {
		System.out.println("Media Checked In");
	}
	public void checkOut() {
		System.out.println("Media Checked out");
	}
	public void addItem() {
		System.out.println("Media added");
	}
}
