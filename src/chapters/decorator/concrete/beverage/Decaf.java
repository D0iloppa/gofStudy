package chapters.decorator.concrete.beverage;

import chapters.decorator.idea.Beverage;

import java.util.ArrayList;

public class Decaf extends Beverage {
    public Decaf() {
        description = new ArrayList<String>(){{
            add("디카페인");
        }};
    }

    public Decaf(Size size){
        description = new ArrayList<String>(){{
            add("디카페인");
        }};

        this.setSize(size);
    }

    public double cost() {
        return 1.05 * this.getSize().getValue();
    }
}
