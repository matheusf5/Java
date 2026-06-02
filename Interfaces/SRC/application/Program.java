package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args)  throws ParseException{
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Número: ");
		Integer number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy):");
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Valor do contrato: R$");
		Double value = sc.nextDouble();
		System.out.print("Entre com o número de parcelas: ");
		Integer amount = sc.nextInt();
		
		Contract contract = new Contract (number, date, value);
		
		ContractService contractService = new ContractService (new PaypalService());
		 
		contractService.processContract(contract, amount);
		
		System.out.println("Parcelas: ");
		
		for (Installment i : contract.getInstallments()) {
			System.out.println(sdf.format(i.getDueDate()) + " - " + String.format("%.2f", i.getAmount()));
		}
		sc.close();
	}
}
