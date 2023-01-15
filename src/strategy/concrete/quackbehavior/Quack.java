package strategy.concrete.quackbehavior;

import strategy.idea.quackbehavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
