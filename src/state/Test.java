package state;

public class Test {
    public static void main(String[] args) {
        IOrder order = new OrderImpl();
        order.doActivity();
        System.out.println("----------------------------------");
        order.deliver();
        System.out.println("----------------------------------");
        order.doActivity();
        System.out.println("----------------------------------");
        order.failOrder();
    }
}
