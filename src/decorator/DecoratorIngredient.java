package decorator;

public abstract class DecoratorIngredient extends Drink {
    protected Drink drink;
    public DecoratorIngredient(Drink drink) {
        this.drink = drink;
    }
    public abstract String getDescription();
}