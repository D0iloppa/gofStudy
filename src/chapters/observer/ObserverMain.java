package chapters.observer;

import main.MainTest;
import chapters.observer.concrete.observer.CurrentConditionsDisplay;
import chapters.observer.concrete.observer.ForecastDisplay;
import chapters.observer.concrete.observer.HeatIndexDisplay;
import chapters.observer.concrete.subject.WeatherData;

public class ObserverMain implements MainTest {
    @Override
    public void execute() {
        WeatherData weatherData = new WeatherData();


        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMesurements(80,65,30.4f);
        weatherData.setMesurements(82,70,29.2f);
        weatherData.setMesurements(78,90,29.2f);





    }

    @Override
    public String description() {
        String description = "옵저버 패턴";
        return description;
    }


}
