import java.util.Locale;
import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int N;
		System.out.println("Digite um valor para N: ");
		N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			if(N % i == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		sc.close();
		
	}

}
