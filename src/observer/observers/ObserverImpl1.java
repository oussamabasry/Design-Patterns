package observer.observers;

public class ObserverImpl1 implements Observer {
    private double somme;
    @Override
    public void update(int etat) {
        somme += etat;
        System.out.println("Observer 1 Somme=" + somme);

    }
}
