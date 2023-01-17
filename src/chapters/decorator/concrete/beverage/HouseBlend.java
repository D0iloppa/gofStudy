package chapters.decorator.concrete.beverage;

import chapters.decorator.idea.Beverage;

import java.util.ArrayList;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = new ArrayList<String>(){{
            add("하우스 블렌드 커피");
        }};
    }

    public HouseBlend(Size size){
        description = new ArrayList<String>(){{
            add("하우스 블렌드 커피");
        }};
        this.setSize(size);
    }

    public double cost() {
        return 0.89 * this.getSize().getValue();
    }
}
