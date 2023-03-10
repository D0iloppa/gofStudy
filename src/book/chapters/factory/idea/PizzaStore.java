package book.chapters.factory.idea;

import book.chapters.factory.concrete.exception.PizzaException;
import book.chapters.factory.idea.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type) throws PizzaException{
        Pizza pizza;


        pizza = createPizza(type);
        // 해당 type의 pizza가 존재하지 않는 경우 exception 처리
        if(pizza == null)
            throw new PizzaException("존재하지 않는 피자", type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
