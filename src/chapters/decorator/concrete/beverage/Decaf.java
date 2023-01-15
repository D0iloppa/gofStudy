package chapters.decorator.concrete.beverage;

import chapters.decorator.idea.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "디카페인";
    }

    public double cost() {
        return 1.05;
    }
}
