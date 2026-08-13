package exceptionHandling;
import java.util.*;

public class FinallyExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			System.out.println("Result: "+a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getLocalizedMessage());
		}
		finally {
			System.out.println("Code is executed Successfully");
			sc.close();
			// we have to close the db connectivity here only......
		}

	}

}
