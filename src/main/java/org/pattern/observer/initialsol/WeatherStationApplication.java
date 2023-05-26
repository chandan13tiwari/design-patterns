package org.pattern.observer.initialsol;

public class WeatherStationApplication {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData(82, 70, 29.32f);
        weatherData.measurementChanged();
    }
}
