package book.chapters.strategy.concrete;

import book.chapters.strategy.concrete.flybehavior.FlyWithWings;
import book.chapters.strategy.concrete.quackbehavior.Quack;
import book.chapters.strategy.idea.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {

        System.out.println("저는 물오리입니다.");
    }
}
