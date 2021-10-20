package decorator;

public abstract class Drink {
    protected String description;
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}