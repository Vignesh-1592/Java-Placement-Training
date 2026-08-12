package inheritanceExample;

public class UpiService extends PaymentService {
	void payWithUPI(String upiId, long mobileNo) {
		super.sendOTP(mobileNo);
		System.out.println("Purchased with upi "+ upiId);
	}
}
