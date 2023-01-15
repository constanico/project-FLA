package model;

public abstract class Coffee {

	private String name;
	private String type;
	private String sugar;
	private Espresso espresso;
	private Milk milk;
	private Water water;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getSugar(){
		return sugar;
	}

	public void setSugar(String sugar){
		this.sugar = sugar;
	}
	public String getCoffeeType() {
		return type;
	}

	public void setCoffeeType(String coffeeType) {
		this.type = coffeeType;
	}

	public Espresso getEspresso() {
		return espresso;
	}

	public void setEspresso(Espresso espresso) {
		this.espresso = espresso;
	}

	public Milk getMilk() {
		return milk;
	}

	public void setMilk(Milk milk) {
		this.milk = milk;
	}

	public Water getWater() {
		return water;
	}

	public void setWater(Water water) {
		this.water = water;
	}
	
}
