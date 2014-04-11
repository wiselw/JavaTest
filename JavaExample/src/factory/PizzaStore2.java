package factory;

public class PizzaStore2 {
	SimplePizzaFactory factory;
	public PizzaStore2(SimplePizzaFactory factory){
		this.factory=factory;
	}
	public Pizza orderPizza(String type){
		Pizza pizza;
		pizza=factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}

}
