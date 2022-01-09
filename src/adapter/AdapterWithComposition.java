package adapter;

public class AdapterWithComposition implements Standard {
    private AdaptedImpl adapted=new AdaptedImpl();
    @Override
    public void operation(int nb1, int nb2) {
        int nb= adapted.operation2(nb1, nb2);
        adapted.operation3(nb);
    }
}
