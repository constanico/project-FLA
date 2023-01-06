package adapter;

import payment.Payment;
import payment.TransferPayment;

public class TransferPaymentAdapter implements Payment{
	
	private TransferPayment transfer;

	public TransferPaymentAdapter(TransferPayment transfer) {
		super();
		this.transfer = transfer;
	}

	@Override
	public String getPayment() {
		// TODO Auto-generated method stub
		return null;
	}

}
