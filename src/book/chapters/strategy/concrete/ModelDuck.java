package book.chapters.strategy.concrete;

import book.chapters.strategy.concrete.flybehavior.FlyNoWay;
import book.chapters.strategy.concrete.quackbehavior.Quack;
import book.chapters.strategy.idea.Duck;

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
