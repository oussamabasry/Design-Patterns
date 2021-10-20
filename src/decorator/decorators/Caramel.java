package decorator.decorators;

import decorator.DecoratorIngredient;
import decorator.Drink;

public class Caramel extends DecoratorIngredient {
    public Caramel(Drink drink) {
        super(drink);
    }

    public double cost() {
        return 2.90 + drink.cost();
    }

    public String getDescription() {
        return drink.getDescription() + ", Caramel";
    }
}