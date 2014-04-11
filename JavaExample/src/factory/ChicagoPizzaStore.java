package factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza=null;
		if (type.equals("cheese")){
			pizza= new ChicagoStyleCheesePizza();
		} else if(type.equals("pepperoni")){
			pizza= new PepprtoniPizza();
		} else if(type.equals("clam")){
			pizza =new ClamPizza();
		} else if(type.equals("veggie")){
			pizza=new VeggiePizza();
		}
		return pizza;
	}

}
