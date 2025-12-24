import java.util.Locale;
import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar 
		   o valor da área deste círculo com quatro casas decimais conforme exemplos.
		   
		   Fórmula da área: area = π . raio2
		   
		   Considere o valor de π = 3.14159
		   	
		*/
		
		Scanner sc = new Scanner (System.in); 	
		Locale.setDefault(Locale.US);
	
		double PI = 3.14159, area, raio;
		
		System.out.print("Digite o valor do raio do círculo: ");
		raio = sc.nextDouble();
		
		area = PI * (raio * raio);
		
		System.out.printf("A área é: %.4f", area);
		
		sc.close();
	}

}
