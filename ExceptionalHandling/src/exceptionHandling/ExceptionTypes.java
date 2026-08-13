package exceptionHandling;

/* Exception --> Exception can be handled. 
 *  It is called run-time error and can be recovered*/

// Error --> Error cannot be recovered...

/* Compile time Exception - 
 * 1. IOException
 * 2. SQLException 
 * 3.ClassNotFoundException
 * --> A checked exception(compile exception) is an exception, 
 * that the compiler forces you to handle using try-cagtch or throws
 */

/* Runtime Exception(unchecked Exception) - 
 * 1. Arithmetic Exception
 * 2. NullPointerException
 * 3. NumberFormatException
 * 4. IndexOutOfBoundsException
 * --> Unchecked Exception are exceptions that are not checked by the compiler.
 * They occur at runtime
 */

/* Note: --> Null value can only be declared to Non-Primitive Data types only
 * Null --> Nothing value --> Null is very sensitive exception in software development
 * --> We should handle NullPointerException always
 */

public class ExceptionTypes {
	public static void main(String[] args) {
		int nums[] = {10,20,30,40};
		
		//****ArrayOutOfBoundsException Case****//
		
		try {
			System.out.println(nums[8]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//****StringIndexOutOfBoundsException Case****//
		
		String name = "Java";
		try {
			System.out.println(name.charAt(10));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//****NullPointerException Case****//
		String str = null;
		try {
			
			System.out.println(str.substring(4));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//****NumberFormatException Case****//

		String value = "abc";
		// Instead of "abc", if we give "123", exception will not occur

		try {
		    int rollno = Integer.parseInt(value);
		    System.out.println(rollno);
		}
		catch (Exception e) {
		    System.out.println(e.getMessage());
		}
		finally{
			System.out.println("Rest of the code");
		}

	}	
}
