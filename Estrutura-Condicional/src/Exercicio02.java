import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Fazer um programa para ler um número inteiro 
		 * e dizer se este número é par ou ímpar.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A; 
		
		System.out.println("Digite um número: ");
		A = sc.nextInt();
		
		if ( A % 2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é impar");
		}
		
		
		
		sc.close();
	}

}
