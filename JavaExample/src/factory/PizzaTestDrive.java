package factory;

public class PizzaTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PizzaStore nyStore=new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore =new ChicagoPizzaStore();
        Pizza pizza=nyStore.orderPizza("cheese");
        System.out.println("Ethan order a" +pizza.getName());
        pizza=chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Jane  order a" +pizza.getName());
	}

}
