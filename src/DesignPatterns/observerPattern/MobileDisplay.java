package DesignPatterns.observerPattern;

public class MobileDisplay implements DisplayObserver {
    WSObservable wsObservable;

    public MobileDisplay(WSObservable wsObservable) {
        this.wsObservable = wsObservable;
    }
    @Override
    public void update() {
        wsObservable.getData();
//        display(temperature, humidity, pressure);
    }

    void display(float temperature, float humidity, float pressure){
        System.out.println("Current Condition Display"+" "+temperature+" "+humidity+" "+pressure);
    }
}
