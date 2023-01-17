package adapter;

import payment.CashPayment;
import payment.TransferPayment;

public class TransfertoCashAdapter extends CashPayment{
	private TransferPayment transfer;
	public TransfertoCashAdapter(TransferPayment transfer) {
		this.transfer = transfer;
	}

	public Integer getCashPrice(){
		return transfer.getTransferPrice();
	}
}
