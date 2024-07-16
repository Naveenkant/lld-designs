package DesignPatterns.observerPattern;

public interface WSObservable {

    void registerObserver(DisplayObserver o);
    void removeObserver(DisplayObserver o);
    void notifyObservers();
    float getData();
}
