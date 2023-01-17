package book.chapters.factory;

import book.chapters.factory.concrete.store.ChicagoPizzaStore;
import book.chapters.factory.concrete.store.NYPizzaStore;
import book.chapters.factory.idea.Pizza;
import book.chapters.factory.idea.PizzaStore;
import main.MainTest;

public class FactoryMain implements MainTest {

    public String description() {
        String description = "팩토리 패턴";
        return description;
    }

    @Override
    public void execute() {
        pizzaTest();
    }

    private void pizzaTest() {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();


        Pizza pizza = null;
        String type = null;
        // 에단이 주문
        try {
            type = "cheese";
            pizza = nyStore.orderPizza(type);
            System.out.printf("에단이 주문한 %s\n\n",pizza.getName());
        } catch (Exception e) {
            System.err.printf("에러발생 : [pizza type='%s'] %s\n",type,e.getMessage());
        }

        // 조엘이 주문
        try{
            type = "cheese";
            pizza = chicagoStore.orderPizza(type);
            System.out.printf("조엘이 주문한 %s\n\n",pizza.getName());
        }catch (Exception e){
            System.err.printf("에러발생 : [pizza type='%s'] %s\n",type,e.getMessage());
        }

        // 존재하지 않는 유형 주문 한 경우
        try {
            type = "test";
            pizza = nyStore.orderPizza(type);
            System.out.printf("도일이 주문한 %s\n\n",pizza.getName());
        } catch (Exception e) {
            System.err.printf("에러발생 : [PIZZA TYPE='%s'] %s\n",type,e.getMessage());
        }

    }



}
