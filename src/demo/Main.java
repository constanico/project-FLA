package demo;

import java.util.Scanner;

import facade.InsertStockFacade;
import facade.OrderingCoffeeFacade;
import model.Order;
import singleton.Database;

public class Main {
	
	private Scanner scan = new Scanner(System.in);
	Database database;
	public Main() {
		InsertStockFacade isf = new InsertStockFacade(10000, 10000, 50);
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
			
			switch (menu) {
			case 1:
				orderCoffee();
				break;
			case 2:
				viewOrder();
				break;
			case 3:
				return;
			}
		}
	}

	private void orderCoffee() {
		// TODO Auto-generated method stub
		OrderingCoffeeFacade ocf = new OrderingCoffeeFacade();
		ocf.OrderingCoffee();
	}

	private void viewOrder() {
		// TODO Auto-generated method stub
		for (Order order : database.getTransactionList()) {
			int i = 1;
			System.out.println(i + " " + order.getCoffee().getName());
			i++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
