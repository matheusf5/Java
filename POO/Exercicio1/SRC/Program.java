package Application;

import java.util.Locale;
import java.util.Scanner;
import Util.Banco;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double saldo;
		char resposta;
		Banco conta;
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();	
		System.out.print("Is there na initial deposit (Y/N)? ");
		resposta = sc.next().charAt(0);
		
		if(resposta == 'Y' || resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			saldo = sc.nextDouble();
			conta = new Banco(numeroConta, nome, saldo);
		}
		else {
			conta = new Banco(numeroConta, nome);
		}
		
		System.out.println("\nAccount data: ");
		System.out.print(conta);
		
		System.out.println();
		System.out.print("\nEnter a deposit value:  ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);
		System.out.print("Updated account data: ");
		System.out.println(conta);
		
		System.out.print("\nEnter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.print("Updated account data: ");
		System.out.println(conta);
		
		
		sc.close();
	}

}
