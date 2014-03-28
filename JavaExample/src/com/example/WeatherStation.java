package com.example;

public class WeatherStation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentdisplay=new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,62,35.4f);
        weatherData.setMeasurements(83,55,40.4f);
        weatherData.setMeasurements(78,70,25.4f);
        
        
        WeatherData2 weatherData2=new WeatherData2();
        CurrentConditionDisplay2 currentdisplay2=new CurrentConditionDisplay2(weatherData2);
        weatherData.setMeasurements(80,62,35.4f);
        weatherData.setMeasurements(83,55,40.4f);
        weatherData.setMeasurements(78,70,25.4f);
        
	}

}
