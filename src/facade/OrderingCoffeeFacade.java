package facade;

import java.util.Scanner;

import singleton.Database;

public class OrderingCoffeeFacade {
    Scanner sc = new Scanner(System.in);
    private Database db = Database.getDatabase();
    private BrewingCoffeeFacade brewCoffee = new BrewingCoffeeFacade();
    private String order;
    private String sugar;
    private int price;
    public void OrderingCoffee(){
        do {
            System.out.println("What do you want to oder?");
            System.out.println("1. Espresso");
            System.out.println("2. Americano");
            System.out.println("3. Flat WHite");
            System.out.println("4. Cappuccino");
            System.out.println("5. Cafe Latte");
            order = sc.nextLine();
        } while (!(order.equalsIgnoreCase("Espresso") || order.equalsIgnoreCase("Americano") || order.equalsIgnoreCase("Flat White") || order.equalsIgnoreCase("Cappuccino") || order.equalsIgnoreCase("Cafe Latte")));

        if (order.equalsIgnoreCase("Espresso")) {
            brewCoffee.brewingEspresso();
        } else if(order.equalsIgnoreCase("Americano")){
            brewCoffee.brewingAmericano();
        }
        else{
            do {
                System.out.println("Choose your sugar [No Sugar | Less Sugar | Normal Sugar | 125% Sugar]");
                System.out.print(">> ");
                sugar = sc.nextLine();
            } while (!(sugar.equalsIgnoreCase("No Sugar") || sugar.equalsIgnoreCase("Less Sugar") || sugar.equalsIgnoreCase("Normal Sugar") || sugar.equalsIgnoreCase("125% Sugar")));
            
            if(order.equalsIgnoreCase("Flat White")){
                brewCoffee.brewingFlatWhite(sugar);
            }
            else if(order.equalsIgnoreCase("Cappuccino")){
                brewCoffee.brewingCappuccino(sugar);
            }
            else if(order.equalsIgnoreCase("Cafe Latte")){
                brewCoffee.brewingCafeLatte(sugar);
            }
        }


    }
    
}
