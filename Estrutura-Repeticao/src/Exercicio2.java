import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int X, Y;
		
		System.out.print("Digite o valor para X: ");
		X = sc.nextInt();
		System.out.print("Digite o valor para Y: ");
		Y = sc.nextInt();
		
		while (X != 0 && Y != 0) {
			if (X > 0 && Y > 0) {
				System.out.print("Primeiro!!!\n");
			}
			else if (X > 0 && Y < 0) {
				System.out.print("Quarto!!!\n");
			}
			else if (X < 0 && Y > 0) {
				System.out.print("Segundo!!!\n");
			}
			else {
				System.out.print("Terceiro!!!\n");
			}
			
			System.out.print("\nDigite o valor para X: ");
			X = sc.nextInt();
			System.out.print("Digite o valor para Y: ");
			Y = sc.nextInt();
		}
		
		

		sc.close();
		
	}

}
