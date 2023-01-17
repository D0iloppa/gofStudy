package book.chapters.strategy.concrete.quackbehavior;

import book.chapters.strategy.idea.quackbehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
