package book.chapters.strategy.concrete.flybehavior;

import book.chapters.strategy.idea.flybehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
