package exceptionHandling;

//***Throw Example***//

class VotingSystem1{
	static void signup(int age) {
		if(age<18) {
			throw new ArithmeticException("Age is Invalid");
			
		}
		
		System.out.println("You can Vote");
	}
	
	static int divide(int a,int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException("Can't divide by zero...");
		}
		return a/b;
	}
}

public class VotingSystem {
	public static void main(String[] args) {
		try {
			VotingSystem1.signup(19);
			VotingSystem1.divide(10,5);
		}
		catch(Exception e) {
			System.out.println("Error Occured");
		}
		
	}
}
