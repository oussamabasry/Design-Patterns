package observer.observers;

import observer.observalble.Observable;
import observer.observalble.ObservableImpl;

public class Test {
    public static void main(String[] args) {
        Observable observable = new ObservableImpl();
        Observer observer1 = new ObserverImpl1();
        Observer observer2 = new ObserverImpl12();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        ((ObservableImpl) observable).setEtat(90);
        System.out.println("-------------");
        ((ObservableImpl) observable).setEtat(60);
    }
}
