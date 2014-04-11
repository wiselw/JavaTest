package factory;

public abstract class PizzaStore {

	public PizzaStore() {
		// TODO Auto-generated constructor stub
	}
	public Pizza orderPizza(String type){
		//
		Pizza pizza;
		pizza=createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	public abstract Pizza createPizza(String type);

}
