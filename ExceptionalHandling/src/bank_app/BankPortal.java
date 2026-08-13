package bank_app;

import java.util.Scanner;

public class BankPortal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankService bs = new BankService();

        System.out.println("1. Search Account");
        System.out.println("2. Login Account");
        System.out.println("3. Withdraw Amount");
        System.out.println("Enter Your Choice:");

        int choice = sc.nextInt();

        switch (choice) {

        case 1:
            System.out.println("Enter the Account Number:");
            long accNo = sc.nextLong();

            try {
                bs.searchAccount(accNo);
            }
            catch (AccountNotFoundException e) {
                System.out.println(e.getMessage());
            }
            break;

        case 2:
            System.out.println("Enter Card Number:");
            int cardNo = sc.nextInt();

            System.out.println("Enter PIN:");
            int pin = sc.nextInt();

            try {
                bs.login(cardNo, pin);
            }
            catch (InvalidPinException e) {
                System.out.println(e.getMessage());
            }
            break;

        case 3:
            System.out.println("Enter Amount:");
            float amount = sc.nextFloat();

            try {
                bs.withdrawl(amount);
                System.out.println("Withdrawal Successful!");
                System.out.println("Remaining Balance: " + bs.currentBalance);
            }
            catch (InsufficientBalanceAccountException | InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
            break;

        default:
            System.out.println("Invalid Choice!");

        }

        sc.close();
    }
}