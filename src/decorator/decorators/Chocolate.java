package decorator.decorators;

import decorator.DecoratorIngredient;
import decorator.Drink;

public class Chocolate extends DecoratorIngredient {
    public Chocolate(Drink drink) {
        super(drink);
    }

    public double cost() {
        return 0.20 + drink.cost();
    }

    public String getDescription() {
        return drink.getDescription() + ", Chocolate";
    }
}