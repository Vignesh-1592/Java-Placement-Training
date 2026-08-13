package polymorphism;

class SwiggyV1{
	void sendOTP() {
		System.out.println("Type your email: ");
		System.out.println("OTp sent to mail, please enter it.....");
	}
	
	void PlaceOrder() {
		System.out.println("Your order is placed");
	}
}

class SwiggyV2 extends SwiggyV1{
	@Override
	void sendOTP() {
		super.sendOTP();
		System.out.println("Type your mobile number:");
		System.out.println("OTP sent to mobile number, please enter it.....");
	}
}

public class MethodOveridingExample {
	public static void main(String[] args) {
		SwiggyV1 v2 = new SwiggyV2();
		v2.sendOTP();
		v2.PlaceOrder();
	}
}
