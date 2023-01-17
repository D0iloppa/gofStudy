package chapters.decorator.idea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Beverage {
    public enum Size {
        // enum 필드영역
        TALL(1.0), GRANDE(1.5), VENTI(2.0);

        private final double multiplication;
        Size(double value) {
            this.multiplication = value;
        }
        public double getValue(){
            return multiplication;
        }
    };
    Size size = Size.TALL;
    protected List<String> description; // = new ArrayList<>();

    public List<String> getDescription() {
        return description;
    }

    public abstract double cost();

    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){
        return this.size;
    }
}
