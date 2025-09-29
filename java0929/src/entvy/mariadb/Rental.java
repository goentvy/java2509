package entvy.mariadb;

public class Rental {
	private int RentalID;
	private int MemberID;
	private int BookID;
	private String RentDate;
	private String ReturnDate;
	
	// 생성자 (전체 필드)
	public Rental(int RentalID, int MemberID, int BookID, String RentDate, String ReturnDate) {
		this.RentalID = RentalID;
		this.MemberID = MemberID;
		this.BookID = BookID;
		this.RentDate = RentDate;
		this.ReturnDate = ReturnDate;
	}
	
	// Getter & Setter
	public int getRentalID() {
		return RentalID;
	}

	public void setRentalID(int rentalID) {
		RentalID = rentalID;
	}

	public int getMemberID() {
		return MemberID;
	}

	public void setMemberID(int memberID) {
		MemberID = memberID;
	}

	public int getBookID() {
		return BookID;
	}

	public void setBookID(int bookID) {
		BookID = bookID;
	}

	public String getRentDate() {
		return RentDate;
	}

	public void setRentDate(String rentDate) {
		RentDate = rentDate;
	}

	public String getReturnDate() {
		return ReturnDate;
	}

	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}
	
	// toString() - 디버깅용
    @Override
    public String toString() {
    	return "User{" + 
    			"RentalID=" + RentalID + 
    			", MemberID='" + MemberID + '\'' + 
    			", BookID='" + BookID + '\'' + 
    			", RentDate'" + RentDate + '\'' + 
    			", ReturnDate'" + ReturnDate + '\'' + 
    			'}';
    }
}
