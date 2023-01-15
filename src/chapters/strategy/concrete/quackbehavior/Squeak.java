package chapters.strategy.concrete.quackbehavior;

import chapters.strategy.idea.quackbehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
