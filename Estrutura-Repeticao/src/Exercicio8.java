import java.util.Locale;
import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N; 
		int fatorial = 1;
		
		System.out.println("Digite um valor para N: ");
		N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			 
			fatorial = fatorial * i;
			
		}
		
		System.out.println("Fatorial de N = " + fatorial) ;
		
		
		sc.close();
	}

}
