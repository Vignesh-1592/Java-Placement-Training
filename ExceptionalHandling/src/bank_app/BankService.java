package bank_app;

public class BankService {

		double currentBalance = 35000;
		long nums[] = {10029,10002, 1004,2020};
		
		void searchAccount(long accNo) throws AccountNotFoundException {
			boolean flag = false;
			for(long num:nums) {
				if(num==accNo) {
					System.out.println("Account found!");
					flag = true;
					break;
				}
			}
			
			if(!flag) {
				throw new AccountNotFoundException("Account Not Found");
			}
		}
		
		void login(int cardNo, int pin) throws InvalidPinException {
			if(cardNo == 12345678) {
				if(pin == 2020) {
					System.out.println("Login successful.....");
				}
				else {
					throw new InvalidPinException("Incorrect PIN Number!");
				}
			}
			else {
				System.out.println("Card is Invalid.....");
			}
		}
		
		void withdrawl(float amount) throws InsufficientBalanceAccountException, InvalidAmountException {
			if(amount<=0) {
				throw new InvalidAmountException("Invalid Amount Entered!");
			}
			
			currentBalance-=amount;
			
			if(amount>currentBalance) {
				throw new InsufficientBalanceAccountException("Insuffiencent Balance!");
			}
			
			if(currentBalance<=500) {
				throw new InsufficientBalanceAccountException("Minimum Balance of 500 is Violating, Extra charges on fine will be applicable!");
			}
		}
		
		
}
			
		
			
			
			
			
			
			