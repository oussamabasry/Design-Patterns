package state;

public class DeliveredState extends State{

    public DeliveredState(OrderImpl order) {
        super(order);
    }

    @Override
    void executeDeliver() {
        System.out.println("impossible we are already in the state of delivery");
    }

    @Override
    void executeCancelOrder() {
        System.out.println("impossible we cannot cancel the delivery it is already delivered");
    }

    @Override
    void executeFailOrder() {
        System.out.println("impossible to fail delivery it has already been delivered");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 5; i++) {
            System.out.println("do activity of delivered state");
        }
    }
}
