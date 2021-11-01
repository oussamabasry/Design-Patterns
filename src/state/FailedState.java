package state;

public class FailedState extends State{

    public FailedState(OrderImpl order) {
        super(order);
    }

    @Override
    void executeDeliver() {
        System.out.println("State transition from the failed state to the delivered state");
        order.setState(new DeliveredState(order));
    }

    @Override
    void executeCancelOrder() {
        System.out.println("State transition from the cancel state to the delivered state");
        order.setState(new CancelState(order));
    }

    @Override
    void executeFailOrder() {
        System.out.println("impossible we are already in the state  failed");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 5; i++) {
            System.out.println("do activity of failed state");
        }
    }
}
