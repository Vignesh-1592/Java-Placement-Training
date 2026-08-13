package interface_exam;

public interface UserAccountSerivce {
	
	 void createAccount(User newUser);//in a parameter we can also declare an object.
	 
	 void deleteAccount(String username);

	 void login(String username, String password);
	 
	 void logout(String username);
	 
	 boolean isActive();;
	 
	 boolean isDeactivated();
}
