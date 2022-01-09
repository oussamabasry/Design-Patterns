package adapter;

public class StandardImpl implements Standard{
    @Override
    public void operation(int nb1, int nb2) {
        System.out.println("Standard, Résultat est :"+nb1*nb2);
    }
}
