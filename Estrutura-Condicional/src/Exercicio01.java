import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Fazer um programa para ler um número inteiro, 
		 * e depois dizer se este número é negativo ou não.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A;
		
		System.out.print("Digite um número: ");
		A = sc.nextInt();
		
		if(A > 0) {
			System.out.println("O número é positivo");
		}
		else {
			System.out.println("O número é negativo");
		}
		
		
		sc.close();
	}

}
