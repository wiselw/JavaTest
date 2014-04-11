package factory;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza(){
		name="Chicago Style Deep Dish and Cheese Pizza";
		dough="Extra Thick Crust Dough";
		sauce="Plum Tomato sauce";
		toppings.add("shredded Mozzarella cheese");
	}
    void cut(){
    	//Chicago 风味pizza覆盖cut()将pizz切成正方形
    	System.out.println("Cutting the pizza into square slices");
    }
}
