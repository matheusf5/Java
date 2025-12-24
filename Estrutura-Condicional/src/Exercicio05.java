import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Com base na tabela abaixo, escreva um programa que leia o código 
		 * de um item e a quantidade deste item. A seguir, calcule e mostre o 
		 * valor da conta a pagar.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double cod, qtde, total;
		
		System.out.print("Digite o código do produto: ");
		cod = sc.nextDouble();
		System.out.print("Qual seria a quantidade: ");
		qtde = sc.nextDouble();
		
		if(cod == 1) {
			total = qtde * 4.00;
			System.out.printf("Você comprou %.0f cachorros quente e o total da compra deu: R$ %.2f", qtde, total);
		}
		else if (cod == 2) {
			total = qtde * 4.50;
			System.out.printf("Você comprou %.0f X-salada e o total da compra deu: R$ %.2f", qtde, total);
		} 
		else if (cod == 3) {
			total = qtde * 5.00;
			System.out.printf("Você comprou %.0f X-Bacon e o total da compra deu: R$ %.2f", qtde, total);
		} 
		else if (cod == 4) {
			total = qtde * 2.00;
			System.out.printf("Você comprou %.0f Torradas Simples e o total da compra deu: R$ %.2f", qtde, total);
		} 
		else if (cod == 5) {
			total = qtde * 1.50;
			System.out.printf("Você comprou %.0f Refrigerantes e o total da compra deu: R$ %.2f", qtde, total);
		} 
		
		
		sc.close();
	}	

}
