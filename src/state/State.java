package state;

public abstract class State {
    protected OrderImpl order;

    public State(OrderImpl order){
        this.order = order;
    }
    abstract void executeDeliver();
    abstract void executeCancelOrder();
    abstract void executeFailOrder();
    abstract void executeDoActivity();
}
