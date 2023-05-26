package org.pattern.observer.finalsol.displays;

import org.pattern.observer.finalsol.WeatherData;
import org.pattern.observer.finalsol.observers.Observer;

// here our displays are observers and they are also Display device
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;

    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(){
       this.temp = weatherData.getTemp(); // here we are pulling data from weatherData object
       this.humidity = weatherData.getHumidity();

       display();
    }

    @Override
    public void display() {
        System.out.println("~~~~ CURRENT CONDITIONS DISPLAY ~~~~");
        System.out.println("Temperature is: " + temp);
        System.out.println("Humidity is: " + humidity);
    }
}
