package chapters.decorator.concrete.condiment;

import chapters.decorator.idea.Beverage;
import chapters.decorator.idea.CondimentDecorator;

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
