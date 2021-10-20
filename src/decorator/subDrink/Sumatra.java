package decorator.subDrink;

import decorator.Drink;

public class Sumatra extends Drink {
    public Sumatra(){
        description="Sumatra";
    }
    public double cost() {
        return 8.99;
    }
}