package observerPattern;

public class MainClass {
    public static void main(String[] args) {
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
        WeatherData weatherData = new WeatherData();
        weatherData.registerObserver(currentDisplay);


        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }

}
