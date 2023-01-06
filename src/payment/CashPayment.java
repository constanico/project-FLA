package payment;

public class CashPayment {

	private Integer price;

	public CashPayment(Integer price) {
		super();
		this.price = price;
	}

	public Integer getCashPrice() {
		return price;
	}

}
