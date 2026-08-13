package exceptionHandling;

import java.util.*;

class Instagram{
	static void createAccount() throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your Age:");
		int age = sc.nextInt();
		
		if(age<18) {
			throw new InvalidAgeException("Invalid Age. Age must be greater than 18!");
		}
		System.out.println("Account created successfully!");
	}
}
	

public class CustomeExceptionExample {

	public static void main(String[] args) {
		try {
			Instagram.createAccount();
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of ther code");

	}

}


