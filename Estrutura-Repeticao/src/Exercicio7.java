import java.util.Locale;
import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		int N;
		double A, B;
		
		System.out.print("Digite a quantidade de vezes que vão ser realizada"
				+ "a operação: ");
		N = sc.nextInt();
		System.out.print("\nDigite os valores para A e B respectivamente: \n");
		
		
		for(int i = 0; i<N; i++) {
			
			System.out.print("A: ");
			A = sc.nextDouble();
			System.out.print("B: ");
			B = sc.nextDouble();
			
			if (B == 0) {
				System.out.println("Divisão impossível");
			}
			else
			{
				double resultado; 
				resultado = A / B;
				System.out.printf("Resultado: %.2f\n",resultado);
			}
		}
		
		
		sc.close();
	}

}
