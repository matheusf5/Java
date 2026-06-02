package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxServices;
import model.services.RentalService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.print("Retirada (dd/MM/yy hh:mm): ");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yy hh:mm): ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental cr = new CarRental (start, finish, new Vehicle(carModel));
		
		System.out.print("Entre com preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble(); 
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxServices());
		
		rentalService.processInvoice(cr);
		
		System.out.println("FATURA: ");

		System.out.print("Pagamento básico: " + cr.getInvoice().getBasicPayment());
		System.out.print("\nImposto: " + cr.getInvoice().getTax());
		System.out.print("\nPagamento total: " + cr.getInvoice().getTotalPayment());
		
		sc.close();

	}

}
