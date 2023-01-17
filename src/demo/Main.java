package demo;

import java.util.Scanner;

import facade.InsertStockFacade;
import facade.OrderingCoffeeFacade;
import model.Order;
import singleton.Database;

public class Main {
	
	private Scanner scan = new Scanner(System.in);
	Database database = Database.getDatabase();
	public Main() {
		InsertStockFacade isf = new InsertStockFacade(10000, 10000, 50);
		isf.insertingStock();
		int menu = 0;
		
		while (true) {
			System.out.println("Easy Coffee");
			System.out.println("===========");
			System.out.println("1. Order Coffee");
			System.out.println("2. View Order");
			System.out.println("3. Exit");
			
			do {
				System.out.print(">> ");
				menu = scan.nextInt();
				scan.nextLine();
			} while (menu < 1 || menu > 3);
			cls();
			switch (menu) {
			case 1:
				if(!(database.getStock().get("coffee") <= 0 || database.getStock().get("milk") <= 0 || database.getStock().get("coffee") <= 0)){
					orderCoffee();
				}
				else{
					System.out.println("Sorry, we're out of stock");
				}
				cls();
				break;
			case 2:
				viewOrder();
				scan.nextLine();
				cls();
				break;
			case 3:
				return;
			}
		}
	}

	private void orderCoffee() {
		OrderingCoffeeFacade ocf = new OrderingCoffeeFacade();
		ocf.OrderingCoffee();
	}

	private void viewOrder() {
		if(database.getTransactionList().isEmpty()) {
			System.out.println("No order yet!");
		}else {
			int i = 1;
			int total = 0;
			for (Order order : database.getTransactionList()) {
				System.out.print(i + ". " + order.getCoffee().getName());
				if(order.getCoffee().getSugar() == null){
					System.out.println();
				}
				else{
					System.out.println(" (" + order.getCoffee().getSugar() + ")");
				}
				System.out.println("   Payment: " + order.getPayment().getPaymentDescription());
				total += order.getPayment().getPrice();
				i++;
			}
			
			System.out.println("======================");
			System.out.println("Total Price:  " + total);
		}
		
	}

	private void cls() {
		for(int i = 0; i < 5; i++){
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main();
	}

}
