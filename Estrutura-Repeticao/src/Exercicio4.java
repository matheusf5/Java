import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
		
		int X; 
		
		System.out.print("Digite um valor para X: ");
		X = sc.nextInt();
		
		for(int i = 0; i <= X; i++) {
			
			if(i % 2 == 1) {
				System.out.println(i);
			}
				
		}
		
		
		sc.close();
	}

}
