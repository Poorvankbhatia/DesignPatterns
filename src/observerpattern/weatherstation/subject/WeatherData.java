package observerpattern.weatherstation.subject;

import observerpattern.weatherstation.display.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private int humidity;
    private int temperature;
    private int pressure;
    private boolean hasDataChanged;

    public WeatherData() {
        this.observers = new ArrayList<>();
        this.hasDataChanged = false;
    }



    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int index = this.observers.indexOf(o);
        if(index>=0) {
            this.observers.remove(index);
        }
    }

    @Override
    public void notifyObservers(Object arg) {
        if(hasDataChanged) {
            for (Observer o : observers) {
                o.update(this, arg);
            }
            hasDataChanged = false;
        }
    }

    @Override
    public void notifyObservers() {
        notifyObservers(null);
    }

    @Override
    public void setChanged() {
        this.hasDataChanged=true;
    }

    public void setParams(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        measurementChanges();
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void measurementChanges() {
        setChanged();
        notifyObservers(); // Pull mechanism , just notifying observers that something has changed.
        /*
        can also use notifyObservers(object); based on push or pulling mechanism.
         */
    }
}
