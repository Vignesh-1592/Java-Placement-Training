package inheritanceExample;
import java.util.Scanner;
public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		System.out.println("1.credit card payment");
		System.out.println("2.NetBanking payment");
		System.out.println("3.UPI payment");
		System.out.println("Enter your choice:");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			CreditCardService cs = new CreditCardService();
			cs.payWithCreditCard(987654321,12341234);
			break;
		case 2:
			NetBankingSerive ns = new NetBankingSerive();
			ns.payWithNetBanking(607848385, 1234567890);
			break;
		case 3:
			UpiService us = new UpiService();
			us.payWithUPI("vignesh@upi", 987654321);
			break;
		default:
			System.out.println("Invalid Choice");
		}
	}
}
