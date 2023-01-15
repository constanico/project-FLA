package factory;

import model.Milk;

public class FoamMilkFactory implements MilkFactory{

    @Override
    public Milk createMilkType(int ml) {
        // TODO Auto-generated method stub
        System.out.println("Adding Foam Milk");
        return new Milk(ml);
    }
    
}
