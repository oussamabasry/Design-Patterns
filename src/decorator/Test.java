package decorator;

import decorator.decorators.Caramel;
import decorator.decorators.Chocolate;
import decorator.subDrink.Colombia;
import decorator.subDrink.Espresso;

public class Test {
    public static void main(String[] args) {
        Drink drink1=new Espresso();
        System.out.println(drink1.getDescription()+" € "+drink1.cost());
        Drink drink2=new Colombia();
        drink2=new Caramel(drink2);
        drink2=new Chocolate(drink2);
        drink2=new Chocolate(drink2);
        System.out.println(drink2.getDescription()+" € "+drink2.cost());
    }
}
