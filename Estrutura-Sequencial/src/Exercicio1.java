/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses 
   números com uma mensagem explicativa, conforme exemplos.
*/
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int A,B,soma;
		
		System.out.print("Digite o primeiro número para a soma: ");
		A = sc.nextInt();
		System.out.print("Digite o segundo núemro para a soma: ");
		B = sc.nextInt();
		
		soma = A + B; 
		
		System.out.printf("A soma de %d + %d = %d", A, B, soma );

		sc.close();
	}

}
