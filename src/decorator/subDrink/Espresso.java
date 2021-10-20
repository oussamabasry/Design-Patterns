package decorator.subDrink;

import decorator.Drink;

public class Espresso extends Drink {
    public Espresso(){
        description="Espresso";
    }
    public double cost() {
        return 1.99;
    }
}