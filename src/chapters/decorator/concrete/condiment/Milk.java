package chapters.decorator.concrete.condiment;

import chapters.decorator.idea.Beverage;
import chapters.decorator.idea.CondimentDecorator;

import java.util.List;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        Size size = beverage.getSize();
        double cost = 0.10 * size.getValue();
        return beverage.cost() + cost;
    }

    public List<String> getDescription() {

        //return beverage.getDescription() + ", 우유";
        List<String> descriptions = beverage.getDescription();
        descriptions.add("우유");

        return descriptions;
    }
}
