package book.chapters.decorator.concrete.beverage;

import book.chapters.decorator.idea.Beverage;

import java.util.ArrayList;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = new ArrayList<String>(){{
                add("다크 로스트");
        }};
    }

    public DarkRoast(Size size){
        description = new ArrayList<String>(){{
            add("다크 로스트");
        }};
        this.setSize(size);
    }
    public double cost() {
        return 0.99 * this.getSize().getValue();
    }
}
