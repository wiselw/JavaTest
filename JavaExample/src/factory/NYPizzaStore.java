package factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza=null;
		if (type.equals("cheese")){
			pizza= new NYStyleCheesePizza();
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
