package adapter;
import payment.Payment;
import payment.TransferPayment;

public class TransfertoPaymentAdapter implements Payment{

	TransferPayment transfer;

	public TransfertoPaymentAdapter(TransferPayment transfer){
		super();
		this.transfer = transfer;
	}
	@Override
	public String getPaymentDescription() {
		// TODO Auto-generated method stub
		return "Rp " + transfer.getTransferPrice() + " transfer from " + transfer.getAccountNumber();
	}

}
