package book.chapters.decorator.concrete.condiment;

import book.chapters.decorator.idea.Beverage;
import book.chapters.decorator.idea.CondimentDecorator;

import java.util.List;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public double cost() {
        Size size = beverage.getSize();
        double cost = 0.20 * size.getValue();
        return beverage.cost() + cost;
    }


    public List<String> getDescription() {
        //return beverage.getDescription() + ", 모카";
        List<String> descriptions = beverage.getDescription();
        descriptions.add("모카");

        return descriptions;
    }
}
