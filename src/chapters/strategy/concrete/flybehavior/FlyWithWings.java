package chapters.strategy.concrete.flybehavior;

import chapters.strategy.idea.flybehavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}
