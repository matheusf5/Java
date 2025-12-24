import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		Fazer um programa para ler o código de uma peça 1, 
		o número de peças 1, o valor unitário de cada peça 1, o
		código de uma peça 2, o número de peças 2 e o valor unitário 
		de cada peça 2. Calcule e mostre o valor a ser pago.
		*/
		
		
		int cod1, cod2; 
		double qtde1, qtde2, valor_unit_1, valor_unit_2, total;
		
		System.out.print("Digite o código do produto 1: ");
		cod1 = sc.nextInt();
		System.out.printf("Digite a quantidade que você deseja: ");
		qtde1 = sc.nextDouble();
		System.out.printf("Digite o valor desta peça: ");
		valor_unit_1 = sc.nextDouble();
				

		System.out.printf("\nDigite o código do produto 2: ");
		cod2 = sc.nextInt();
		System.out.printf("Digite a quantidade que você deseja: ");
		qtde2 = sc.nextDouble();
		System.out.printf("Digite o valor desta peça: ");
		valor_unit_2 = sc.nextDouble();
		
		total = (qtde1 * valor_unit_1) + (qtde2 * valor_unit_2);
		
		System.out.printf("\nValor total a pagar: R$%.2f", total);
		
		sc.close();

	}

}
