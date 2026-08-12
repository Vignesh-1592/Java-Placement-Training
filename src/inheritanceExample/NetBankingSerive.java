package inheritanceExample;



public class NetBankingSerive extends PaymentService {
	void payWithNetBanking(long customerId, long mobileNo) {
		super.sendOTP(mobileNo);
		System.out.println("Purchased with NetBanking "+ customerId);
	}

}
