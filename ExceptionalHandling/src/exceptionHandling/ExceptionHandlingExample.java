package exceptionHandling;

//Multiple catch can be written for one try catch......

//**Handling of Multiple exception in Single try method**//

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		
		
		try {
			int nums[] = {10,20,30,40};
			System.out.println(nums[8]);
			
			String name = "Java";
			System.out.println(name.charAt(10));
			
			System.out.println(10/0);
		}
		
		catch(IndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}
}

