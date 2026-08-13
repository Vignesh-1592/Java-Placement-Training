package interface_exam;

public class User {
	private String name;
	private String emailId;
	private String username;
	private String password;
	private long phoneNumber;
	
	public User(String name, String emailId, String username, String password, String dateOfBirth, long phoneNumber) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.username = username;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	void getDetails() {
		System.out.println("Name: "+name);
		System.out.println("Username: "+username);
		System.out.println("Email Id: "+emailId);
		System.out.println("Mobile Number: "+phoneNumber);
	}
	
}


