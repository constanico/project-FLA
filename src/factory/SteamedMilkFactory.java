package factory;

import model.Milk;

public class SteamedMilkFactory implements MilkFactory{

    @Override
    public Milk createMilkType(int ml) {
        // TODO Auto-generated method stub
        System.out.println("Adding Steamed Milk");
        return new Milk(250);
    }
    
}
