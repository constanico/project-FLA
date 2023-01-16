package demo;

import java.util.Scanner;

import model.Order;
import singleton.Database;

public class Main {
	
	private Scanner scan = new Scanner(System.in);
	Database database;
	public Main() {
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
		System.out.println("Menu");
		System.out.println("========================");
		System.out.println("1. Ristretto");
		System.out.println("2. Espresso");
		System.out.println("3. Lungo");
		System.out.println("4. Macchiato");
		System.out.println("5. Cortado");
		System.out.println("6. Americano");
		System.out.println("7. Flat White");
		System.out.println("8. Cappucinno");
		System.out.println("9. Cafe Au Lait");
		System.out.println("10. Cafe Latte");
		System.out.println("11. Piccolo Latte");
		System.out.println("12. Cafe Mocha");
		System.out.print(">>");
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
