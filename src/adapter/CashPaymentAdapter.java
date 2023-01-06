package adapter;

import payment.CashPayment;
import payment.Payment;

public class CashPaymentAdapter implements Payment{
	
	private CashPayment cash;

	public CashPaymentAdapter(CashPayment cash) {
		super();
		this.cash = cash;
	}

	@Override
	public String getPayment() {
		// TODO Auto-generated method stub
		return "$ " + cash.getCashPrice();
	}
	

}
