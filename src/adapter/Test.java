package adapter;

public class Test {
    public static void main(String[] args) {
        Standard standard=new StandardImpl();
        standard.operation(7, 9);
        Standard adapted1=new AdapterWithInheritance();
        adapted1.operation(7, 9);
        Standard adapted2=new AdapterWithComposition();
        adapted2.operation(7, 9);
    }
}
