package facade;

import java.util.Scanner;

import adapter.CashtoPaymentAdapter;
import adapter.TransfertoPaymentAdapter;
import model.Coffee;
import model.Order;
import payment.CashPayment;
import payment.Payment;
import payment.TransferPayment;
import singleton.Database;

public class OrderingCoffeeFacade {
    Scanner sc = new Scanner(System.in);
    private Coffee coffee;
    private Database db = Database.getDatabase();
    private BrewingCoffeeFacade brewCoffee = new BrewingCoffeeFacade();
    private Payment paymentMethod;
    private String order, payment;
    private String sugar;
    private int price = 0;
    private Order finishOrder;
    public void OrderingCoffee(){
        do {
            System.out.println("What do you want to oder?");
            System.out.println("1. Espresso");
            System.out.println("2. Americano");
            System.out.println("3. Flat WHite");
            System.out.println("4. Cappuccino");
            System.out.println("5. Cafe Latte");
            System.out.print(">>");
            order = sc.nextLine();
        } while (!(order.equalsIgnoreCase("Espresso") || order.equalsIgnoreCase("Americano") || order.equalsIgnoreCase("Flat White") || order.equalsIgnoreCase("Cappuccino") || order.equalsIgnoreCase("Cafe Latte")));

        if (order.equalsIgnoreCase("Espresso")) {
            coffee = brewCoffee.brewingEspresso();
        } else if(order.equalsIgnoreCase("Americano")){
            coffee = brewCoffee.brewingAmericano();
        }
        else{
            do {
                System.out.println("Choose your sugar [No Sugar | Less Sugar | Normal Sugar | 125% Sugar]");
                System.out.print(">> ");
                sugar = sc.nextLine();
            } while (!(sugar.equalsIgnoreCase("No Sugar") || sugar.equalsIgnoreCase("Less Sugar") || sugar.equalsIgnoreCase("Normal Sugar") || sugar.equalsIgnoreCase("125% Sugar")));
            
            if(order.equalsIgnoreCase("Flat White")){
                coffee = brewCoffee.brewingFlatWhite(sugar);
            }
            else if(order.equalsIgnoreCase("Cappuccino")){
                coffee = brewCoffee.brewingCappuccino(sugar);
            }
            else if(order.equalsIgnoreCase("Cafe Latte")){
                coffee = brewCoffee.brewingCafeLatte(sugar);
            }
        }
        transactionOrder();
    }

    public void transactionOrder(){
        do {
            System.out.println("Choose your payment:");
            System.out.println("1. Cash");
            System.out.println("2. Transfer");
            payment = sc.nextLine();
        } while (!(payment.equalsIgnoreCase("Cash") || payment.equalsIgnoreCase("Transfer")));

        if (order.equalsIgnoreCase("Espresso")) {
            price = 15000;
        } else if(order.equalsIgnoreCase("Americano")){
            price = 20000;
        }
        else if(order.equalsIgnoreCase("Flat White") || order.equalsIgnoreCase("Cappuccino") || order.equalsIgnoreCase("Cafe Latte")){
            price = 25000;
        }
        
        if(payment.equalsIgnoreCase("Cash")){
            paymentMethod = new CashtoPaymentAdapter(new CashPayment(price));
        }
        else if(payment.equalsIgnoreCase("Transfer")){
            System.out.print("Input your account number: ");
            String accountNumber = sc.nextLine();
            paymentMethod = new TransfertoPaymentAdapter(new TransferPayment(price, accountNumber));
        }
        addingToRepository();
    }

    public void addingToRepository(){
        finishOrder = new Order(coffee, paymentMethod);
        db.getTransactionList().add(finishOrder);
    }
    
}
