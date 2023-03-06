package atm;

import java.util.*;

public class atm {
	public static void main(String args[]) {

		int pin = 0000; // Pin number of user
		int balance = 10000; // Current Balance
		int deposit = 0;
		int withdraw = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Hello!!");
		System.out.println("");
		System.out.println("Enter Your PIN NUMBER: ");

		int password = sc.nextInt();

		// Checks pin number
                if (password == pin) {
			System.out.println("Enter Your NAME: ");
			String name = sc.next();
			System.out.println("");
			System.out.println("WELCOME " + name);
		} else {
			System.out.println("Your PIN NUMBER is wrong.. Please try again!!!");
		}

		while (true) { 
                    
			System.out.println("___________________________________________________");
			System.out.println("");
			System.out.println("              WELCOME TO ATM MACHINE               ");
			System.out.println("CLICK NUMBERS THAT YOU WANT TO PERFORM: ");
			System.out.println("Click 1 to Deposit Amount:");
			System.out.println("Click 2 to Withdraw Amount:");
			System.out.println("Click 3 to Check Balance:");
			System.out.println("Click 4 EXIT:");
			System.out.println("___________________________________________________");
			// operations that has to be performed by user
			int option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.println("Enter your Amount to be Deposit: ");
				deposit = sc.nextInt();
				balance = deposit + balance;
				System.out.println("You have successfully deposited your amount:" + balance);
				System.out.println("");
				break;
			case 2:
				System.out.println("Enter your Withdrawn Amount:");
				withdraw = sc.nextInt();
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your MONEY");
				} else {
					System.out.println("Insufficient Balance");
				}
				System.out.println("");
				break;
			case 3:
				System.out.println("Your Current Balance is: " + balance);
				System.out.println("");
				break;
			case 4:
				System.exit(0);
			}

		}
	}

}