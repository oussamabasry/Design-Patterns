package state;

public class OrderImpl implements IOrder {
    private State state;

    public OrderImpl(){
        state = new InitialState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public void deliver() {
        state.executeDeliver();
    }

    @Override
    public void cancelOrder() {
        state.executeCancelOrder();
    }

    @Override
    public void failOrder() {
        state.executeFailOrder();
    }

    @Override
    public void doActivity() {
        state.executeDoActivity();
    }
}
