package entvy.mariadb;

public class Member {
	private int memberid;
	private String name;
	private String address;
	private String phone;
	
	// 생성자 (전체 필드)
	public Member(int memberid, String name, String phone, String address) {
		this.memberid = memberid;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	// 생성자 (id 없이 - AUTO_INCREMENT)
	public Member(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	
	// Getter & Setter
	public int getMemberid() {
        return memberid;
    }

    public String getName() {
        return name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getAddress() {
        return address;
    }
    
    // toString() - 디버깅용
    @Override
    public String toString() {
    	return "User{" + 
    			"memberid=" + memberid + 
    			", name='" + name + '\'' + 
    			", phone='" + phone + '\'' + 
    			", address'" + address + '\'' + 
    			'}';
    }
}
