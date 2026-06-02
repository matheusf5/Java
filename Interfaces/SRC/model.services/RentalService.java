package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerDay;
	private Double priePerHour;
	
	private TaxService taxService;

	public RentalService(Double pricePerDay, Double priePerHour, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.priePerHour = priePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		double hours = minutes/60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = this.priePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours/24.0);
		}
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
	
	
	
}
