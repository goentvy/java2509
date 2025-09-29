package entvy.lee;

import java.time.LocalDate;

public class User {
	private int id;
	private String name;
	private String email;
	private LocalDate hireDate;
	
	// 생성자 (전체 필드)
	public User(int id, String name, String email, LocalDate hireDate) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.hireDate = hireDate;
	}
	
	// 생성자 (id 없이 - AUTO_INCREMENT)
	public User(String name, String email, LocalDate hireDate) {
		this.name = name;
		this.email = email;
		this.hireDate = hireDate;
	}
	
	// Getter & Setter
	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    
    // toString() - 디버깅용
    @Override
    public String toString() {
    	return "User{" + 
    			"id=" + id + 
    			", name='" + name + '\'' + 
    			", email='" + email + '\'' + 
    			", hireDate=" + hireDate + 
    			'}';
    }
}
