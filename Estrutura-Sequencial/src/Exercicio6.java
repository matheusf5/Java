import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Fazer um programa que leia três valores com ponto flutuante 
		 * de dupla precisão: A, B e C. Em seguida, calcule e
		 
		   mostre:
		   a) a área do triângulo retângulo que tem A por base e C por altura.
		   b) a área do círculo de raio C. (pi = 3.14159)
		   c) a área do trapézio que tem A e B por bases e C por altura.
		   d) a área do quadrado que tem lado B.
		   e) a área do retângulo que tem lados A e B
		 
		 */
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, Triangulo, Quadrado, Trapezio, Circulo, PI = 3.14159 , Retangulo;
		
		System.out.println("Digite o valor para A, B, C:");
		System.out.print("A: ");
		A = sc.nextDouble();
		System.out.print("B: ");
		B = sc.nextDouble();
		System.out.print("C: ");
		C = sc.nextDouble();
	
	
		// Cálculo do Triangulo 
		
		Triangulo = (A * C)/2;
		
		// Cálculo do Quadrado 
		
		Quadrado = B * B;
		
		// Cálculo do Trapezio 
		
		Trapezio = ((A + B) * C) / 2;
		
		//Cálculo do Circulo 
		
		Circulo = PI * (C * C);
		
		// Cálculo do Retangulo 
		
		Retangulo = A * B; 
		
		System.out.printf("Triangulo: %.4f", Triangulo);
		System.out.printf("\nQuadrado: %.4f", Quadrado);
		System.out.printf("\nTrapezio: %.4f", Trapezio);
		System.out.printf("\nCirculo: %.4f", Circulo);
		System.out.printf("\nRetangulo: %.4f", Retangulo);
	
	
		sc.close();
	
	}

}
