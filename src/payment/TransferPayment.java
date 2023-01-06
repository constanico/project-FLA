package payment;

public class TransferPayment {

	private Integer price;
	private String accountNumber;

	public TransferPayment(Integer price, String accountNumber) {
		super();
		this.price = price;
		this.accountNumber = accountNumber;
	}

	public Integer getTransferPrice() {
		return price;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

}
