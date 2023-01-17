package chapters.decorator.concrete.condiment;

import chapters.decorator.idea.Beverage;
import chapters.decorator.idea.CondimentDecorator;

import java.util.List;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        Size size = beverage.getSize();
        double cost = 0.15 * size.getValue();
        return beverage.cost() + cost;
    }

    public List<String> getDescription() {
        // return beverage.getDescription() + ", 두유";

        List<String> descriptions = beverage.getDescription();
        descriptions.add("두유");

        return descriptions;
    }
}
