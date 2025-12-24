import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Leia a hora inicial e a hora final de um jogo. A seguir calcule 
		 * a duração do jogo, sabendo que o mesmo pode começar em um dia e 
		 * terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int horaInicial, horaFinal, total;
		
		System.out.print("Digite a hora de inicio: ");
		horaInicial = sc.nextInt();
		

		System.out.print("Digite a hora de termino: ");
		horaFinal = sc.nextInt();
		
		
		if (horaInicial < horaFinal) {
			total = horaFinal - horaInicial;
			System.out.printf("A partida durou: %d horas", total);
		}
		else if(horaInicial > horaFinal) {
			total = (24 - horaInicial) + horaFinal;
			System.out.printf("O jogo durou %d horas", total );
		}
		else  {
			System.out.println("A partida durou 24hrs");
		}
		
		
		
		sc.close();
	}

}
