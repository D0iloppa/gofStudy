package book.chapters.factory.idea;

import book.chapters.factory.idea.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) throws Exception{
        Pizza pizza;


        pizza = createPizza(type);
        // 해당 type의 pizza가 존재하지 않는 경우 exception 처리
        if(pizza == null)
            throw new Exception("존재하지 않는 피자");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
