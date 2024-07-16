package DesignPatterns.observerPattern;

public class TVDisplay implements DisplayObserver{
   WSObservable wsObservable;

   TVDisplay(WSObservable wsObservable) {
       this.wsObservable = wsObservable;
   }
    void display(float temperature, float humidity, float pressure){
        System.out.println("Current Condition Display"+" "+temperature+" "+humidity+" "+pressure);
    }

    @Override
    public void update() {
    float d=    wsObservable.getData();
        display(d,d,d);
    }
}
