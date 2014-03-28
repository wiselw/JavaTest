package com.example;

public class Whip extends CondimentDecorator {
	Beverage beverage;
    public Whip(Beverage beverage){
    	this.beverage=beverage;
    }
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",Whip";//длсм;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return .10+beverage.cost();
	}

}