import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		int N;
		int in = 0, out = 0;
		
		System.out.println("Digite a quantidade de números que serão lidos: ");
		N = sc.nextInt();
		
		for(int i = 1; i<=N; i++) {
			int resposta; 
			resposta = sc.nextInt();

			if(resposta >= 10 && resposta <= 20) {
				in += 1;
			}
			else {
				out += 1;
			}
			
		}
		
		System.out.println("In: " + in);
		System.out.println("Out: " + out);
		
		sc.close();
	}

}
