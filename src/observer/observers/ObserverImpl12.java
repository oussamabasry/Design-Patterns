package observer.observers;

public class ObserverImpl12 implements Observer {
    double lastState;
    @Override
    public void update(int etat) {

        if (etat - lastState > 0)
            System.out.println("Observateur 2 => Auguementation de la pression");
        else if (etat - lastState < 0)
            System.out.println("Observateur 2 => depression");
        else System.out.println("Observateur 2 => Stabilit�");
        lastState = etat;
    }

}
