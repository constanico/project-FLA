package factory;

import model.Milk;

public class FoamMilkFactory implements MilkFactory{

    @Override
    public Milk createMilkType() {
        // TODO Auto-generated method stub
        return new Milk(50);
    }
    
}
