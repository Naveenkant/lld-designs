package observerPattern;

public class CurrentConditionDisplay  implements Observer{
    @Override
    public void update(float temperature, float humidity, float pressure) {
        display(temperature, humidity, pressure);
    }
    void display(float temperature, float humidity, float pressure){
        System.out.println("Current Condition Display"+" "+temperature+" "+humidity+" "+pressure);
    }
}
