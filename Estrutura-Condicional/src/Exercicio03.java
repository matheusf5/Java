import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Leia 2 valores inteiros (A e B). Após, o programa deve 
		 * mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos", 
		 * indicando se os valores lidos são múltiplos entre si. 
		 * Atenção: os números devem poder ser digitados em ordem crescente ou 
		 * decrescente.
		 */		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		int A, B;
		
		System.out.print("Digite o valor para A: ");
		A = sc.nextInt();
		System.out.printf("\nDigite o valor para B: ");
		B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0 ) {
			System.out.println("Os número são Multiplos");
		}
		else {
			System.out.println("Os número não são Multiplos");
		}
		
		sc.close();		
	}

}
