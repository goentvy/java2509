package entvy.mariadb;

public class Book {
	private int BookID;
	private String Title;
	private String Author;
	private String Publisher;
	private int Price;
	private String PubYear;
	
	// 생성자 (전체 필드)
	public Book(int BookID, String Title, String Author, String Publisher, int Price, String PubYear) {
		this.BookID = BookID;
		this.Title = Title;
		this.Author = Author;
		this.Publisher = Publisher;
		this.Price = Price;
		this.PubYear = PubYear;
	}
	
	// Getter & Setter
	public int getBookID() { return BookID; }
	public String getTitle() { return Title; }
	public String getAuthor() { return Author; }
	public String getPublisher() { return Publisher; }
	public int getPrice() { return Price; }
	public String getPubYear() { return PubYear; }
	
	// toString() - 디버깅용
    @Override
    public String toString() {
    	return "User{" + 
    			"BookID=" + BookID + 
    			", Title='" + Title + '\'' + 
    			", Author='" + Author + '\'' + 
    			", Publisher'" + Publisher + '\'' + 
    			", Price'" + Price + '\'' + 
    			", PubYear'" + PubYear + '\'' + 
    			'}';
    }
}
