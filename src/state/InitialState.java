package state;

public class InitialState extends State{

    public InitialState(OrderImpl order) {
        super(order);
    }

    @Override
    void executeDeliver() {
        System.out.println("State transition from the initial state to the state delivered ");
        order.setState(new DeliveredState(order));
    }

    @Override
    void executeCancelOrder() {
        System.out.println("State transition from the initial state to the state cancel");
        order.setState(new CancelState(order));
    }

    @Override
    void executeFailOrder() {
        System.out.println("State transition from the initial state to the state failed");
        order.setState(new FailedState(order));
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 5; i++) {
            System.out.println("do activity of initial state");
        }
    }
}
