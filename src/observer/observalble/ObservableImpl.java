package observer.observalble;


import observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;


public class ObservableImpl implements Observable {

    private final List<Observer> observers = new ArrayList<>();
    private int etat;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);

    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
        this.notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(etat);
        }

    }

}
