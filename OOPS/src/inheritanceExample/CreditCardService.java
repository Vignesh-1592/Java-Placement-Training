package inheritanceExample;

public class CreditCardService extends PaymentService {
	void payWithCreditCard(long mobileNo, long cardNo) {
		super.sendOTP(mobileNo);
		System.out.println("Purchased with credit card "+cardNo);
	}
}
