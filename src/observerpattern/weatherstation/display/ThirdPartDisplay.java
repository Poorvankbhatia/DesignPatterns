package observerpattern.weatherstation.display;

import observerpattern.weatherstation.subject.Subject;
import observerpattern.weatherstation.subject.WeatherData;

public class ThirdPartDisplay implements Observer,DisplayElement {
    private int temperature;
    private int humidity;
    private final Subject subject;

    public ThirdPartDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(humidity +" "+temperature);
    }

    @Override
    public void update(Subject s, Object o) {
        if(o!=null) {
            // Get required parameters.
        } else {
            if(s instanceof WeatherData) {
                WeatherData wd = (WeatherData) s;
                this.humidity = wd.getHumidity();
                this.temperature = wd.getTemperature();
            }
        }
        display();
    }

    @Override
    public void stopSubscription() {
        subject.removeObserver(this);
    }
}
