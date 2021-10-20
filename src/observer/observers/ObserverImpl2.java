package observer.observers;

public class ObserverImpl2 implements Observer {
    double lastState;

    @Override
    public void update(int state) {
        if (state - lastState > 0)
            System.out.println("Observer 2 => increased pressure");
        else if (state - lastState < 0)
            System.out.println("Observer 2 => depression");
        else System.out.println("Observer 2 => Stability");
        lastState = state;
    }
}
