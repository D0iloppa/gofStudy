package chapters.observer.concrete.observer;

import chapters.observer.concrete.subject.WeatherData;
import chapters.observer.idea.DisplayElement;
import chapters.observer.idea.Observer;

public class HeatIndexDisplay implements Observer, DisplayElement {
    float heatIndex = 0.0f;

    private WeatherData weatherData;

    public HeatIndexDisplay(WeatherData wetherData) {
        this.weatherData = wetherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("체감 온도: " + heatIndex);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        float t = temperature;
        float rh = humidity;
        heatIndex = (float)
                (
                        (16.923 + (0.185212 * t)) +
                                (5.37941 * rh) -
                                (0.100254 * t * rh) +
                                (0.00941695 * (t * t)) +
                                (0.00728898 * (rh * rh)) +
                                (0.000345372 * (t * t * rh)) -
                                (0.000814971 * (t * rh * rh)) +
                                (0.0000102102 * (t * t * rh * rh)) -
                                (0.000038646 * (t * t * t)) +
                                (0.0000291583 * (rh * rh * rh)) +
                                (0.00000142721 * (t * t * t * rh)) +
                                (0.000000197483 * (t * rh * rh * rh)) -
                                (0.0000000218429 * (t * t * t * rh * rh)) +
                                (0.000000000843296 * (t * t * rh * rh * rh)) -
                                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        display();
    }

    @Override
    public void update() {
        float t = weatherData.getTemperature();
        float rh = weatherData.getHumidity();
        heatIndex = (float)
                (
                        (16.923 + (0.185212 * t)) +
                                (5.37941 * rh) -
                                (0.100254 * t * rh) +
                                (0.00941695 * (t * t)) +
                                (0.00728898 * (rh * rh)) +
                                (0.000345372 * (t * t * rh)) -
                                (0.000814971 * (t * rh * rh)) +
                                (0.0000102102 * (t * t * rh * rh)) -
                                (0.000038646 * (t * t * t)) +
                                (0.0000291583 * (rh * rh * rh)) +
                                (0.00000142721 * (t * t * t * rh)) +
                                (0.000000197483 * (t * rh * rh * rh)) -
                                (0.0000000218429 * (t * t * t * rh * rh)) +
                                (0.000000000843296 * (t * t * rh * rh * rh)) -
                                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
        display();
    }
}
