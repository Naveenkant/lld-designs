package observerPattern;

public class MainClass {
    public static void main(String[] args) {
        WeatherData1 weatherData1 = new WeatherData1();
        MobileDisplay currentDisplay = new MobileDisplay(weatherData1);

        weatherData1.registerObserver(currentDisplay);


        weatherData1.setMeasurements(80, 65, 30.4f);
        weatherData1.setMeasurements(82, 70, 29.2f);
        weatherData1.setMeasurements(78, 90, 29.2f);
    }

}
