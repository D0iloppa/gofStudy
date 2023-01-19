package book.chapters.singleton;

import book.chapters.singleton.concrete.ChocolateBoiler;
import book.chapters.singleton.concrete.ChocolateBoilerEnum;
import book.chapters.singleton.concrete.Singleton;
import main.MainTest;

public class SingletonMain implements MainTest {

    @Override
    public void execute() {

        // 싱글톤 패턴은 enum을 이용하는 것도 좋은 방법이 될 수 있다.
        ChocolateBoilerEnum chocolateBoiler = ChocolateBoilerEnum.INSTANCE;

        System.out.println("empty : " + chocolateBoiler.isEmpty() + " , boiled : " + chocolateBoiler.isBoiled());
        chocolateBoiler.fill();
        System.out.println("empty : " + chocolateBoiler.isEmpty() + " , boiled : " + chocolateBoiler.isBoiled());

        SingletonTest st = new SingletonTest();

        st.test();
        chocolateBoiler.boil();
        st.test();


    }

    @Override
    public String description() {
        String description = "싱글톤 패턴";
        return description;
    }
}
