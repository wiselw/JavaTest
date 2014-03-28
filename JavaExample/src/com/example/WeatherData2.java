package com.example;

import java.util.ArrayList;

public class WeatherData2 implements Subject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
    public WeatherData2(){
    	observers=new ArrayList();
    }
    @Override
    public void registerObserver(Observer o){
    	observers.add(o);
    }
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
        int i=observers.indexOf(o);
        if(i>=0){
        	observers.remove(i);
        }
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
        for(int i=0;i<observers.size();i++){
        	Observer observer=(Observer)observers.get(i);
        	observer.update(temperature, humidity, temperature);
        }
	}
    public void measurementsChanged(){
    	notifyObservers();
    }
    public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
}
