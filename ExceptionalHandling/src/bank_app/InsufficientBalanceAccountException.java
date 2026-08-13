package bank_app;

public class InsufficientBalanceAccountException extends Exception {
	public InsufficientBalanceAccountException(String msg) {
		super(msg);
	}
}
