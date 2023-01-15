package chapters.strategy;

import main.MainTest;
import chapters.strategy.concrete.MallardDuck;
import chapters.strategy.concrete.ModelDuck;
import chapters.strategy.concrete.flybehavior.FlyRocketPowered;
import chapters.strategy.idea.Duck;

public class StrategyMain implements MainTest {

    @Override
    public String description() {
        String description = "전략 패턴";
        return description;
    }
    public void execute() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();


    }
}
