package bank_app;

import java.util.*;

public class AccountNotFoundException extends Exception {
	public AccountNotFoundException(String msg) {
		super(msg);
	}
}