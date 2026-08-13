package basics;
import java.util.*;
public class Palindrome {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int input  = sc.nextInt();
		int rev = 0;
		int temp = input;
		while(temp>0) {
			int digit = temp%10;
			rev = rev*10 + digit;
			temp/=10;
		}
		if(rev == input) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}
}
