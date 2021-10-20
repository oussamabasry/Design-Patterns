package decorator.decorators;

import decorator.DecoratorIngredient;
import decorator.Drink;

public class Vanilla extends DecoratorIngredient {
    public Vanilla(Drink drink) {
        super(drink);
    }

    public double cost() {
        return 3.40 + drink.cost();
    }

    public String getDescription() {
        return drink.getDescription() + ", Vanilla";
    }
}