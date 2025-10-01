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
	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getPubYear() {
		return PubYear;
	}

	public void setPubYear(String pubYear) {
		PubYear = pubYear;
	}
	
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
