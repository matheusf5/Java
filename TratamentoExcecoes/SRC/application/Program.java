package application;

import java.util.Locale;
import java.util.Scanner;

import model.entitites.Account;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
		
		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		Account account = new Account (number, holder, balance, withdrawLimit);
		
		
		System.out.printf("\nEnter amount for withdraw: ");
		double amount = sc.nextDouble();
		account.withDraw(amount);
		
		System.out.printf("\nNew balance: %.2f", account.getBalance());
		}
		catch(DomainExceptions e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		catch(RuntimeException f) {
			System.out.println("Erro não identificado ");
		}
	
		sc.close();

	}

}
