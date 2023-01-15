package decorator;

import decorator.concrete.beverage.DarkRoast;
import decorator.concrete.beverage.Espresso;
import decorator.concrete.beverage.HouseBlend;
import decorator.concrete.condiment.Mocha;
import decorator.concrete.condiment.Soy;
import decorator.concrete.condiment.Whip;
import decorator.idea.*;
import main.MainTest;

public class DecoratorMain implements MainTest {

    @Override
    public String description() {
        String description = "데코레이터 패턴";
        return description;
    }
    
    public void execute(){

        Beverage beverage = new Espresso();
        sysout(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        sysout(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        sysout(beverage3);
    }

    private void sysout(Beverage beverage) {
        System.out.printf("%s $%.2f\n" , beverage.getDescription(),beverage.cost());
    }

}
