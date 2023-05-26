package org.pattern.observer.finalsol.displays;

import org.pattern.observer.finalsol.WeatherData;
import org.pattern.observer.finalsol.observers.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private float pressure;

    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
        this.temp = weatherData.getTemp();
        this.humidity = weatherData.getHumidity();
        this.pressure = weatherData.getPressure();

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
