package inheritanceExample;

public class BankServiceV1 {

	

	void deposit(long accountNumber,float amount) {

		System.out.println("Amount "+ amount + " deposited to "+ accountNumber);

	}

	

	void withdraw(long accountNumber,float amount) {

		System.out.println("Amount " + amount + " withdrawn from "+ accountNumber);

	}

	

	void printReceipt() {

		System.out.println("Account No:");

		System.out.println("Account Holder Name:");

		System.out.println("Balance");

	}

}

