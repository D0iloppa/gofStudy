package strategy.concrete.quackbehavior;

import strategy.idea.quackbehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
