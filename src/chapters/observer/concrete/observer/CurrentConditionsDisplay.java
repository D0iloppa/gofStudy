package chapters.observer.concrete.observer;

import chapters.observer.concrete.subject.WeatherData;
import chapters.observer.idea.DisplayElement;
import chapters.observer.idea.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    // observer를 등록, subject 객체에 pull 할 수 있도록
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.printf("현재 상태 : 온도 %.1fF, 습도 %.1f퍼센트\n",temperature,humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();;
    }
}
