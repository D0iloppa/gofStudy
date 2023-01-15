package chapters.strategy;

import chapters.strategy.concrete.DuckPager;
import chapters.strategy.concrete.quackbehavior.Quack;
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
        System.out.print("mallard(quack) : ");
        mallard.performQuack();
        System.out.print("mallard(fly) : ");
        mallard.performFly();

        Duck model = new ModelDuck();
        System.out.print("model(fly) : ");
        model.performFly();
        System.out.println("-- model duck에게 로켓 추진기를 셋팅");
        model.setFlyBehavior(new FlyRocketPowered());
        System.out.print("model(fly) : ");
        model.performFly();

        // Duck 클래스를 호출 받지 않음
        // 오리 소리를 내기만 함
        DuckPager duckPager = new DuckPager();
        duckPager.setSound(new Quack());
        System.out.print("호출기(quack) : ");
        duckPager.sound();



    }
}
