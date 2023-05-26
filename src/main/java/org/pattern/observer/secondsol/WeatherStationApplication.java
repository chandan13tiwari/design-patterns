package org.pattern.observer.secondsol;

import org.pattern.observer.secondsol.displays.CurrentConditionDisplay;
import org.pattern.observer.secondsol.displays.ForecastDisplay;
import org.pattern.observer.secondsol.displays.StatisticsDisplay;

public class WeatherStationApplication {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);

        weatherData.removeObserver(statisticsDisplay);

        weatherData.setMeasurements(10, 15, 10.4f);
    }
}
