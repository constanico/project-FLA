package factory;
import model.Milk;

public interface MilkFactory {

	public abstract Milk createMilkType(int ml);
	
}