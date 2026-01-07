import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int alcool = 0, gasolina = 0, diesel = 0, resposta;
		
		System.out.println("Qual é o combustível que você usa? ");
		resposta = sc.nextInt();
		
		while (resposta != 4) {
			if(resposta == 1) {
				alcool += 1; 
			}
			else if (resposta == 2 ) {
				gasolina += 1;
			}
			else if(resposta == 3) {
				diesel +=1;
			}
			else if (resposta == 4) {
				System.out.println("Pesquisa finalizada!!!");
			}
			else {
				System.out.println("Digite um valor entre (1 a 4): 1.Álcool 2.Gasolina 3.Diesel 4.Fim");
			}
			System.out.println("Qual é o combustível que você usa? ");
			resposta = sc.nextInt();
		}
		
		System.out.println("Muito obrigado!!!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		
		sc.close();
	}

}
