package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData1 implements WSObservable {
    private List<DisplayObserver> displayObservers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData1() {
        displayObservers = new ArrayList<>();

    }

    @Override
    public void registerObserver(DisplayObserver o) {
        displayObservers.add(o);
    }

    @Override
    public void removeObserver(DisplayObserver o) {
        displayObservers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (DisplayObserver displayObserver : displayObservers) {
//            displayObserver.update(temperature, humidity, pressure);
            displayObserver.update();
        }

    }

    @Override
    public float getData() {
        return this.temperature;
    }

    public void measurementsChanged() {
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    public float[] getMeasurements() {
        return new float[]{this.temperature,this.humidity,this.pressure};
    }
}
