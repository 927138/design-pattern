package com.yh.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherDate = new WeatherData();

        CurrentConditionDisplay display1 = new CurrentConditionDisplay(weatherDate);
        StatisticsDisplay display2 = new StatisticsDisplay(weatherDate);
        ForecastDisplay display3 = new ForecastDisplay(weatherDate);
        HeatIndexDisplay display4 = new HeatIndexDisplay(weatherDate);

        weatherDate.setMeasurements(80, 65, 30.4f);
        weatherDate.setMeasurements(82, 70, 29.2f);
        weatherDate.setMeasurements(78, 90, 29.2f);
    }
}
