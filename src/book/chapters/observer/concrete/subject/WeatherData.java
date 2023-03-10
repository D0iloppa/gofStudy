package book.chapters.observer.concrete.subject;

import book.chapters.observer.idea.Observer;
import book.chapters.observer.idea.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;


    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            // observer.update(temperature,humidity,pressure);
            // pull 방식으로 처리
            observer.update();
        }
    }

    public void mesurementsChanged(){
        notifyObservers();
    }

    public void setMesurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        mesurementsChanged();
    }
}
