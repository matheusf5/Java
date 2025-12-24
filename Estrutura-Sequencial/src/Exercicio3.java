import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, 
		 * calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo 
		 * a fórmula: DIFERENCA = (A * B - C * D).
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int A, B, C, D, Diferenca; 
		
		System.out.println("Digite os valores para A e B"); 
		System.out.print("A: ");
		A = sc.nextInt();
		System.out.print("B: ");
		B = sc.nextInt();
		
		System.out.println("Digite os valores para C e D"); 
		System.out.print("C: ");
		C = sc.nextInt();
		System.out.print("D: ");
		D = sc.nextInt();
		
		Diferenca = (A * B) - (C * D);
		
		System.out.printf("A diferença é: %d", Diferenca);
		
		sc.close();
	}

}
