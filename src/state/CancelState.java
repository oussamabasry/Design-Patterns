package state;

public class CancelState extends State{

    public CancelState(OrderImpl order) {
        super(order);
    }

    @Override
    void executeDeliver() {
        System.out.println("impossible we cannot delver the delivery it is already canceled");
    }

    @Override
    void executeCancelOrder() {
        System.out.println("impossible we are already in cancel state");
    }

    @Override
    void executeFailOrder() {
        System.out.println("impossible to fail delivery it has already been cancel");
    }

    @Override
    void executeDoActivity() {
        for (int i = 0; i < 5; i++) {
            System.out.println("do activity of cancel state");
        }
    }
}
