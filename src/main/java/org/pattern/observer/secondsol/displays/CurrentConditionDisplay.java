package org.pattern.observer.secondsol.displays;

import org.pattern.observer.secondsol.WeatherData;
import org.pattern.observer.secondsol.observers.Observer;

// here our displays are observers and they are also Display device
public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    // private float pressure;

    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temp, float humidity, float pressure){ // note that pressure is waste here
       this.temp = temp;
       this.humidity = humidity;

       display();
    }

    @Override
    public void display() {
        System.out.println("~~~~ CURRENT CONDITIONS DISPLAY ~~~~");
        System.out.println("Temperature is: " + temp);
        System.out.println("Humidity is: " + humidity);
        //System.out.println("Pressure is: " + pressure);
    }
}
