package inheritanceExample;


public class SingleInheritanceExample {



	public static void main(String[] args) {

		BankServiceV1 a=new BankServiceV2();

		a.deposit(1234567, 5000);

		a.withdraw(1234567, 500);



	}



}
