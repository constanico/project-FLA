package model;

import payment.Payment;

public class Order {
	
	private Coffee coffee;
	private Payment payment;
	
	public Order(Coffee coffee, Payment payment) {
		super();
		this.coffee = coffee;
		this.payment = payment;
	}

	public Coffee getCoffee() {
		return coffee;
	}

	public void setCoffee(Coffee coffee) {
		this.coffee = coffee;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

}
