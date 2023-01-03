package demo;

import java.util.Scanner;

public class Main {
	
	private Scanner scan = new Scanner(System.in);

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
				
				break;
			case 2:
				
				break;
			case 3:
				return;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
