package strategy.concrete;

import strategy.concrete.flybehavior.FlyWithWings;
import strategy.concrete.quackbehavior.Quack;
import strategy.idea.Duck;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {

        System.out.println("저는 물오리입니다.");
    }
}
