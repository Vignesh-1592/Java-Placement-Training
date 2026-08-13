package exceptionHandling;

//**EXCEPTION HANDLING**//

/*Exception handling is a mechanism to handle runtime errors 
 * so that the normal flow of the program can continue 
 * instead of terminating unexpectedly.
 */

public class ExceptionIssue {
	public static void main(String[] args) {
		System.out.println("Line 1");
		System.out.println("Line 2");
		System.out.println("Line 3");
		System.out.println("Line 4");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println(e.getLocalizedMessage());
			System.out.println("Divide by Zero Exception Occured");
		}
		System.out.println("Line 5");
		System.out.println("Line 6");
		System.out.println("Line 7");
		System.out.println("Line 8");
	}
}

