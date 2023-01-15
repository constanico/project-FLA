package factory;

import model.Milk;

public class SteamedMilkFactory implements MilkFactory{

    @Override
    public Milk createMilkType() {
        // TODO Auto-generated method stub
        return new Milk(250);
    }
    
}
