package facade;

import model.Coffee;
import model.Espresso;
import model.Milk;
import model.Water;
import singleton.Database;

public class InsertStockFacade {
    
    Database db = Database.getDatabase();
    Espresso coffee;
    Milk milk;
    Water water;
    private Integer waterStock, milkStock, coffeeStock;
    public InsertStockFacade(Integer waterStock, Integer milkStock, Integer coffeeStock){
        this.waterStock = waterStock;
        this.milkStock = milkStock;
        this.coffeeStock = coffeeStock;
    }

    public void insertingStock(){
        db.getStock().put("coffee", coffeeStock);
        db.getStock().put("water", waterStock);
        db.getStock().put("milk", milkStock);
    }
}
