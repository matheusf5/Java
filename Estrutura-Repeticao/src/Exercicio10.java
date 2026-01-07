import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		int N;
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		
		
		sc.close();
	}

}
