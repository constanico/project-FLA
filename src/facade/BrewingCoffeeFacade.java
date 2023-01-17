package facade;

import java.util.HashMap;
import builder.CoffeeBuilder;
import factory.MilkFactory;
import model.Coffee;
import model.Espresso;
import model.Milk;
import model.Water;
import singleton.Database;

public class BrewingCoffeeFacade {
    private Database db = Database.getDatabase();
    private HashMap<Object, Integer> stock = db.getStock();
    private MilkFactory steamed;
    private MilkFactory foam;
    private Coffee coffee;
    private Espresso espresso = new Espresso();
    private Water water = new Water();
    private Milk milk;
    private Milk foamMilk;
    private Milk steamMilk;

    public Coffee brewingEspresso(){
        coffee = new CoffeeBuilder().setName("Espresso").setEspresso(espresso).buildCoffee();
        stock.put(coffee, stock.get(coffee) - 1);
        System.out.println("Brewing " + coffee.getName());
        return coffee;
    }

    public Coffee brewingAmericano(){
        coffee = new CoffeeBuilder().setName("Americano").setEspresso(espresso).setWater(water).buildCoffee();
        stock.put(coffee, stock.get(coffee) - 1);
        stock.put(water, stock.get(water) - water.getMl());
        System.out.println("Brewing " + coffee.getName());
        return coffee;
    }

    public Coffee brewingFlatWhite(String sugar){
        foamMilk = foam.createMilkType(10);
        steamMilk = steamed.createMilkType(250);
        coffee = new CoffeeBuilder().setName("Flat White").setEspresso(espresso).setSteamedMilk(steamMilk).setFoam(foamMilk).setSugar(sugar).buildCoffee();
        stock.put(coffee, stock.get(coffee) - 1);
        stock.put(milk, stock.get(milk) - coffee.getMilk().getMl());
        System.out.println("Brewing " + coffee.getName());
        Milk.setMl();
        return coffee;
    }

    public Coffee brewingCappuccino(String sugar){
        foamMilk = foam.createMilkType(50);
        steamMilk = steamed.createMilkType(250);
        coffee = new CoffeeBuilder().setName("Cappuccino").setEspresso(espresso).setSteamedMilk(steamMilk).setFoam(foamMilk).setSugar(sugar).buildCoffee();
        stock.put(coffee, stock.get(coffee) - 1);
        stock.put(milk, stock.get(milk) - coffee.getMilk().getMl());
        System.out.println("Brewing " + coffee.getName());
        Milk.setMl();
        return coffee;
    }

    public Coffee brewingCafeLatte(String sugar){
        foamMilk = foam.createMilkType(30);
        steamMilk = steamed.createMilkType(250);
        coffee = new CoffeeBuilder().setName("Cafe Latte").setEspresso(espresso).setSteamedMilk(steamMilk).setFoam(foamMilk).setSugar(sugar).buildCoffee();
        stock.put(coffee, stock.get(coffee) - 1);
        stock.put(milk, stock.get(milk) - coffee.getMilk().getMl());
        System.out.println("Brewing " + coffee.getName());
        Milk .setMl();
        return coffee;
    }
}
