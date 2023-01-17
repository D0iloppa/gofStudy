package book.chapters.strategy.concrete.quackbehavior;

import book.chapters.strategy.idea.quackbehavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("꽥");
    }
}
