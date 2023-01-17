package book.chapters.observer.concrete.observer;

import book.chapters.observer.concrete.subject.WeatherData;
import book.chapters.observer.idea.DisplayElement;
import book.chapters.observer.idea.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float currentPressure = 29.92f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData wetherData) {
        this.weatherData = wetherData;
        weatherData.registerObserver(this);
    }


    public void display() {
        System.out.print("기상 예보: ");
        if (currentPressure > lastPressure) {
            System.out.println("날씨가 좋아지고 있습니다.");
        } else if (currentPressure == lastPressure) {
            System.out.println("지금과 비슷할 것 같습니다.");
        } else if (currentPressure < lastPressure) {
            System.out.println("쌀쌀하며 비가 올 것 같습니다.");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
