package polymorphism;
import java.util.*;
public class BankApplication {

	public static void main(String[] args) {
		System.out.println("Amount deposit gateway");
		System.out.println("1. Deposit using challan");
		System.out.println("2.UPI");
		System.out.println("3.NetBanking");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		
		BankService bs = new BankService();
		switch(choice) {
		case 1:
			bs.deposit("Emp001", 1234564, 2500.00f);
			break;
		case 2:
			bs.deposit("Vicky@upi", 1234, 3000.00f);
			break;
		case 3:
			bs.deposit(987654321, "srec123", 1000);
			break;
		default:
			System.out.println("Invalid choice");
		}
		
		//***String Concept***
		
//		String s = "Computer Science";
//		System.out.println(s.substring(3));
//		System.out.println(s.substring(3,7));//**Method Overloading**
//		
//		String str = new String();
//		String str2 = new String("Vignesh"); //**Constructor Overloading**
		
	}
}
