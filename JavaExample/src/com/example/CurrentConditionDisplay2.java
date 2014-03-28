package com.example;

import java.util.Observable;

public class CurrentConditionDisplay2 implements Observer, DisplayElement {

	private Subject observable;
	private float temperature;
	private float hunidity;
	public CurrentConditionDisplay2(Subject observable){
		this.observable=observable;
		observable.registerObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditions:"
				+temperature+"F degrees and"+hunidity+"%hunidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature=temp;
    	this.hunidity=humidity;
    	display();
	}

}
