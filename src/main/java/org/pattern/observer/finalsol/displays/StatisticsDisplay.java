package org.pattern.observer.finalsol.displays;

import org.pattern.observer.finalsol.WeatherData;
import org.pattern.observer.finalsol.observers.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

        display();
    }

    @Override
    public void display() {
        System.out.println("~~~~ STATISTICS DISPLAY ~~~~");
        System.out.println("Humidity is: " + humidity);
        System.out.println("Pressure is: " + pressure);
    }
}
