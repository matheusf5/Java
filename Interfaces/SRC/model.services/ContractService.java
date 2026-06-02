package model.services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService paymentService; 
	
	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer months) {
		
		double installment = contract.getTotalValue() / months;
		
		for(int i =1; i <= months; i++ ) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(contract.getDate());
			cal.add(Calendar.MONTH, i);
			Date dueDate = cal.getTime();
			
			double interest = paymentService.interest(installment, i);
			double paymentFee = paymentService.paymentFee(interest);
			
			Installment installments = new Installment(dueDate, paymentFee);
			
			contract.addInstallment(installments);
				
		}
	}
}
