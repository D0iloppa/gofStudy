package strategy.concrete;

import strategy.concrete.flybehavior.FlyNoWay;
import strategy.concrete.quackbehavior.Quack;
import strategy.idea.Duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }
}
