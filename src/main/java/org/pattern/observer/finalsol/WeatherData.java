package org.pattern.observer.finalsol;

import org.pattern.observer.finalsol.observers.Observer;

import java.util.ArrayList;
import java.util.List;

//WeatherData is our Subject here
public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observerList = new ArrayList<>();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged(); // updating observers that values has been updated
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(Observer observer : observerList) {
            observer.update();
        }
    }


    // this method will notify observers or subscribers whenever measurement changed
    public void measurementChanged() {
       notifyObserver();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
