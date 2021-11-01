package state;

public interface IOrder {
    void deliver();
    void cancelOrder();
    void failOrder();
    void doActivity();
}
