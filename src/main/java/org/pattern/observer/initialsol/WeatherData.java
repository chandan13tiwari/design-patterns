package org.pattern.observer.initialsol;

import org.pattern.observer.initialsol.displays.CurrentConditionDisplay;
import org.pattern.observer.initialsol.displays.ForecastDisplay;
import org.pattern.observer.initialsol.displays.StatisticsDisplay;

public class WeatherData {

    float temp = 0f;
    float humidity = 0f;
    float pressure = 0f;

    public WeatherData(){ }

    public WeatherData(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementChanged();
    }

    CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();

    public float getTemp() {
        return this.temp;
    }

    public float getHumidity() {
        return this.humidity;
    }

    public float getPressure() {
        return this.pressure;
    }

    // this method will fetch the weather data and update the displays
    public void measurementChanged() {
        float temp = getTemp();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
}
