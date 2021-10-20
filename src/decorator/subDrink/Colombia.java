package decorator.subDrink;

import decorator.Drink;

public class Colombia extends Drink {
    public Colombia(){
        description="Colombia";
    }
    public double cost() {
        return 7.89;
    }
}