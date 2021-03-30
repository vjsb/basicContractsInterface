package services;

import java.util.Date;

import entities.Contract;
import entities.Installment;

import java.util.Calendar;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
		
		//calcula o valor da parcela base pegando o valor total e dividindo pelos meses
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			
			//atualiza o valor base da parcela com os juros e com a quantidade de parcelas
			double updateQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
			
			//pega o valor atualizado e adiciona a taxa de pagamento
			double fullQuota = updateQuota + onlinePaymentService .paymentFee(updateQuota);
			
			//adiciona os meses ao contrato, e adiciona as instancias do contrato criado a lista
			Date dueDate = addMonths(contract.getDate(), i);
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
		
	}
	
	private Date addMonths(Date date, int N) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, N);
		return calendar.getTime();
	}
		
	
}
