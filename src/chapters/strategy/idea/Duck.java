package chapters.strategy.idea;

import chapters.strategy.idea.flybehavior.FlyBehavior;
import chapters.strategy.idea.quackbehavior.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    // 동적으로 행동 지정
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Duck() { }

    

    public abstract void display();

    public void performFly(){
        // fly를 flyBehavior에게 위임
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
    }
}
