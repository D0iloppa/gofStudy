package chapters.strategy.concrete;

import chapters.strategy.concrete.flybehavior.FlyNoWay;
import chapters.strategy.concrete.quackbehavior.Quack;
import chapters.strategy.idea.Duck;

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
