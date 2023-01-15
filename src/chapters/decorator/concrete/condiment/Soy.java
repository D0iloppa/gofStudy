package chapters.decorator.concrete.condiment;

import chapters.decorator.idea.Beverage;
import chapters.decorator.idea.CondimentDecorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        return beverage.cost() + 0.15;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }
}
