package chapters.strategy.concrete.quackbehavior;

import chapters.strategy.idea.quackbehavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용~ >>");
    }
}
