package application;

import java.util.Locale;
import java.util.Scanner;

import utilities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Account account;
				
		System.out.print("Enter account number: ");
		Integer number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?: ");
		char initial = sc.next().charAt(0);
		if (initial == 'y') {
			System.out.print("Enter initial deposit value: ");
			 double initialDeposit = sc.nextDouble();
			 account = new Account (number, holder,initialDeposit);
		}  else if (initial == 'n') {
			System.out.println();
			 account = new Account(number, holder);
		} else {
			System.out.println("Digito irregular!");
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a deposit value:");
		double valueDeposit = sc.nextDouble();
		account.deposit(valueDeposit);		
		System.out.println("Update account data:");
		System.out.println(account);
		
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		double valueWithdraw = sc.nextDouble();
		account.whitdraw(valueWithdraw);		
		System.out.println("Update account data:");
		System.out.println(account);
		
		sc.close();
		

	}

}
