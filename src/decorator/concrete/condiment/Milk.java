package decorator.concrete.condiment;

import decorator.idea.Beverage;
import decorator.idea.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 우유";
    }
}
