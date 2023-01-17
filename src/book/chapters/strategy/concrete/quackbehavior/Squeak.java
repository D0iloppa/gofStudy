package book.chapters.strategy.concrete.quackbehavior;

import book.chapters.strategy.idea.quackbehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
