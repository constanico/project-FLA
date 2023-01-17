package adapter;

import payment.CashPayment;
import payment.Payment;

public class CashtoPaymentAdapter implements Payment{

    CashPayment cash;

    public CashtoPaymentAdapter(CashPayment cash){
        this.cash = cash;
    }

    @Override
    public String getPaymentDescription() {
        // TODO Auto-generated method stub
        return "Rp " + cash.getCashPrice() + " (Cash)";
    }

    @Override
    public int getPrice() {
        // TODO Auto-generated method stub
        return cash.getCashPrice();
    }
    
}
