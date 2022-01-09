package proxy;

public class Proxy implements Abstraction{
    private Implementation implementation;
    @Override
    public void operation() {

        System.out.println("Vérification des conditions d'accès par le proxy");
        implementation=new Implementation();
        implementation.operation();

    }
}
