package inheritanceExample;

import java.util.Scanner;

public class PaymentService {
	
	Scanner sc = new Scanner(System.in);
	
	void sendOTP(long mobileNo) {
		System.out.println("OTP sent to "+mobileNo+" Please enter...");
	}
}
