package decorator.concrete;

import decorator.idea.Beverage;
import decorator.idea.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.20;
    }


    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}
