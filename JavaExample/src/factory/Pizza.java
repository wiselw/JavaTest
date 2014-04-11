package factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
	String dough;
	String sauce;
	@SuppressWarnings("rawtypes")
	ArrayList toppings=new ArrayList();
	Pizza(){
		
	}

	void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing "+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for(int i=0;i<toppings.size();i++){
			System.out.println("   "+toppings.get(i));
		}
	}

	void bake() {
		// TODO Auto-generated method stub
		System.out.println("Bake for 25 minutes at 350");
	}

	void box() {
		// TODO Auto-generated method stub
		System.out.println("Place pizza in offical PizzaStore box");
	}

	void cut() {
		// TODO Auto-generated method stub
		System.out.println("Cutting the pizza into diagonal slices");
	}
	public String getName(){
		return name;
	}

}
