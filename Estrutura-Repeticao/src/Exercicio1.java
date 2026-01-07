import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		/* Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para 
		 * cada leitura de senha incorreta informada, escrever a mensagem 
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a 
		 * mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha 
		 * correta é o valor 2002.
		*/
		
		int senha;
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.print("\nSenha invalida!");
			System.out.print("\nDigite a senha:");
			senha = sc.nextInt();
		}
		
		System.out.print("\nAcesso permitido!");
		
		sc.close();
		
	}

}
