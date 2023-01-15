package chapters.decorator.concrete.condiment;

import chapters.decorator.idea.Beverage;
import chapters.decorator.idea.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.10;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}
