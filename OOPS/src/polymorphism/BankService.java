package polymorphism;

public class BankService {
	
	double currentBalance = 2000.00;
	
	void deposit(String empId, long chelonNo, float amount) {
		currentBalance = currentBalance+amount;
		System.out.println("Amount :"+amount);
		System.out.println("Employee ID :"+empId);
		System.out.println("Amount deposited Successfully....");
		System.out.println("Total Account Balance: "+currentBalance);
		System.out.println(" ");
	}
	
	void deposit(String upiId, int upiPin, float amount) {
		currentBalance = currentBalance+amount;
		System.out.println("Amount :"+amount);
		System.out.println("UPI ID :"+upiId);
		System.out.println("Amount transfered Successfully....");
		System.out.println("Total Account Balance: "+currentBalance);
		System.out.println(" ");
	}
	
	void deposit(long customerId, String password, float amount) {
		currentBalance = currentBalance+amount;
		System.out.println("Amount :"+amount);
		System.out.println("NetBanking ID :"+customerId);
		System.out.println("Amount trasferred Successfully....");
		System.out.println("Total Account Balance: "+currentBalance);
		System.out.println(" ");
	}
}
