package payment;

public class CashPayment {

	protected Integer price;

	public CashPayment(Integer price) {
		this.price = price;
	}

	public CashPayment(){
	}

	public Integer getCashPrice() {
		return price;
	}

}
