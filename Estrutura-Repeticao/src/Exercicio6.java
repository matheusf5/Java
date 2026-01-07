import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		
		int N; 
		double A,B,C;
		
		System.out.print("Digite a quantidade de casos de testes: ");
		N = sc.nextInt();
		System.out.println("Digite os valores para A, B e C respectivamente: ");
		
		for(int i = 0; i < N ; i++){
			System.out.print("\nA: ");
			A = sc.nextDouble();
			System.out.print("B: ");
			B = sc.nextDouble();
			System.out.print("C: ");
			C = sc.nextDouble();
			
			double media; 
			
			media = ((A * 2) + (B * 3) + (C * 5))/10;
			
			System.out.printf("Media: %.1f\n",media);
		}
		
		
		sc.close();
	}

}
