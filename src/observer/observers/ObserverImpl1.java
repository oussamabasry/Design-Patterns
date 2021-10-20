package observer.observers;

public class ObserverImpl1 implements Observer {
    private double sum;
    @Override
    public void update(int state) {
        sum += state;
        System.out.println("Observer 1 Sum=" + sum);
    }
}
