package book.chapters.decorator.concrete.beverage;

import book.chapters.decorator.idea.Beverage;

import java.util.ArrayList;

public class Espresso extends Beverage {

    public Espresso(){
        description = new ArrayList<String>(){{
            add("에스프레소");
        }};
    }

    public Espresso(Size size){
        description = new ArrayList<String>(){{
            add("에스프레소");
        }};
        this.setSize(size);
    }

    public double cost() {
        return 1.99 * this.getSize().getValue();
    }
}
