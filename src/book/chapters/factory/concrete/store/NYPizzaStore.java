package book.chapters.factory.concrete.store;

import book.chapters.factory.concrete.factory.NYPizzaIngredientFactory;
import book.chapters.factory.concrete.factory.PizzaFactory;
import book.chapters.factory.concrete.pizza.*;
import book.chapters.factory.idea.Pizza;
import book.chapters.factory.idea.PizzaIngredientFactory;
import book.chapters.factory.idea.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;

        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        PizzaFactory pizzaFactory = new PizzaFactory();
        pizza = pizzaFactory.createPizza(type,"뉴욕",ingredientFactory);

        /*
        switch(type){
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 치즈 피자");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 페퍼로니 피자");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 조개 피자");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("뉴욕 스타일 야채 피자");
                break;
        }
        */

        return pizza;
    }
}
