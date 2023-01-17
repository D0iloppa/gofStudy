package book.chapters.strategy.concrete;

import book.chapters.strategy.concrete.quackbehavior.Quack;
import book.chapters.strategy.idea.quackbehavior.QuackBehavior;

// Duck 클래스를 상속 받지 않는 오리 호출기
public class DuckPager {
    QuackBehavior quackBehavior;

    public DuckPager() {
        this.quackBehavior = new Quack();
    }

    public void setSound(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }


    public void sound() {
        quackBehavior.quack();
    }
}
