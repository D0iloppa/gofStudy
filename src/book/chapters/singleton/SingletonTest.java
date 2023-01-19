package book.chapters.singleton;

import book.chapters.singleton.concrete.ChocolateBoilerEnum;

public class SingletonTest {

    void test(){
        // get 인스턴스
        ChocolateBoilerEnum chocolateBoiler = ChocolateBoilerEnum.INSTANCE;
        System.out.println("empty : " + chocolateBoiler.isEmpty() + " , boiled : " + chocolateBoiler.isBoiled());
    }


}
