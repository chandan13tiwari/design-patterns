package org.pattern.observer.secondsol.displays;

import org.pattern.observer.secondsol.WeatherData;
import org.pattern.observer.secondsol.observers.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        display();
    }

    @Override
    public void display() {
        System.out.println("~~~~ FORECAST DISPLAY ~~~~");
        System.out.println("Temperature is: " + temp);
        System.out.println("Humidity is: " + humidity);
        System.out.println("Pressure is: " + pressure);
    }
}
