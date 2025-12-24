import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Fazer um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas, o valor que recebe por
		 * hora e calcula o salário desse funcionário. A seguir, mostre
		 * o número e o salário do funcionário, com duas casas decimais
		 */
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in); 
	
		
		int numero; 
		double horas, valor, salario; 
		
		System.out.print("Digite o código do funcionário: ");
		numero = sc.nextInt();
		
		System.out.println("Digite quantos horas foram trabalhadas e o valor da hora: ");
		System.out.print("Horas: ");
		horas = sc.nextDouble();
		System.out.print("Valor por hora: ");
		valor = sc.nextDouble();
		
		salario = valor * horas;
		
		System.out.printf("\nCódigo do funcionário: %d", numero);
		System.out.printf("\nSalário: U$%.2f", salario);
		
		sc.close();
	}

}
