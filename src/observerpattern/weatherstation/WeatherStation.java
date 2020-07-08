package observerpattern.weatherstation;

import observerpattern.weatherstation.display.CurrentConditionDisplay;
import observerpattern.weatherstation.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay conditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setParams(3,4,5);
    }

}
