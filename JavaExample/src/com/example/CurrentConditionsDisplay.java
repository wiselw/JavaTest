package com.example;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Observable observable;
	private float temperature;
	private float hunidity;
	public CurrentConditionsDisplay(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
        System.out.println("Current conditions:"
		+temperature+"F degrees and"+hunidity+"%hunidity");
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
        if(o instanceof WeatherData){
        	WeatherData weatherData=(WeatherData)o;
        	this.temperature=weatherData.getTmeperature();
        	this.hunidity=weatherData.getHumidity();
        	display();
        }
	}

}
