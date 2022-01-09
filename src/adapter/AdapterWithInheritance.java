package adapter;

public class AdapterWithInheritance extends AdaptedImpl implements Standard{
    @Override
    public void operation(int nb1, int nb2) {
        int nb=operation2(nb1, nb2);
        operation3(nb);

    }
}
