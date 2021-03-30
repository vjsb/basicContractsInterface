package services;

public class PaypalService implements OnlinePaymentService {

	//taxa de pagamento
	private static final double PAYMENT_FEE = 0.02;
	
	//taxa de juros mensais
	private static final double MONTHLY_INTEREST = 0.01;
	
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}

	@Override
	public double interest(double amount, int months) {
		return amount * months * MONTHLY_INTEREST; //pega a quantia multiplica ela pega quantidade de meses e de juros
	}

	
	
}
