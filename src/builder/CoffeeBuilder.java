package builder;

import model.Coffee;
import model.Espresso;
import model.Milk;
import model.Water;

public class CoffeeBuilder {
    private Coffee coffee;

    public CoffeeBuilder(){
        this.coffee = new Coffee();
    }

    public CoffeeBuilder setName(String name){
        coffee.setName(name);
        return this;
    }

    public CoffeeBuilder setSugar(String sugar){
        coffee.setSugar(sugar);
        return this;
    }

    public CoffeeBuilder setEspresso(Espresso espresso){
        coffee.setEspresso(espresso);
        return this;
    }

    public CoffeeBuilder setFoam(Milk milk){
        coffee.setMilk(milk);
        return this;
    }

    public CoffeeBuilder setSteamedMilk(Milk milk){
        coffee.setMilk(milk);
        return this;
    }

    public CoffeeBuilder setWater(Water water){
        coffee.setWater(water);
        return this;
    }

    public Coffee buildCoffee(){
        return this.coffee;
    }

}
