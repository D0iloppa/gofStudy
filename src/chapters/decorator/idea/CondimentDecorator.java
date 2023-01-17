package chapters.decorator.idea;

import java.util.List;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract List<String> getDescription();
    public Size getSize(){
        return beverage.getSize();
    }

}
