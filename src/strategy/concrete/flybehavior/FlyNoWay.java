package strategy.concrete.flybehavior;

import strategy.idea.flybehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
