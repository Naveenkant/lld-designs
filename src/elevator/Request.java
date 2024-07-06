package elevator;

public class Request {
    int  current;
    int destination;

    public Request(int current, int destination) {
        this.current = current;
        this.destination = destination;
    }
    public int getCurrent() {
        return current;
    }
    public int getDestination() {
        return destination;
    }
}
