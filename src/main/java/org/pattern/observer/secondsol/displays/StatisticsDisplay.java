package org.pattern.observer.secondsol.displays;

import org.pattern.observer.secondsol.WeatherData;
import org.pattern.observer.secondsol.observers.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){ // temp is waste
        //this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println("~~~~ STATISTICS DISPLAY ~~~~");
        //System.out.println("Temperature is: " + temp);
        System.out.println("Humidity is: " + humidity);
        System.out.println("Pressure is: " + pressure);
    }
}
