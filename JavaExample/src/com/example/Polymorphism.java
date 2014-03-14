package com.example;
public class Polymorphism {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BaseClass polymorphism = new SubClass();
        System.out.println(polymorphism.book);
        polymorphism.base();
        polymorphism.test();
	}
	

}

