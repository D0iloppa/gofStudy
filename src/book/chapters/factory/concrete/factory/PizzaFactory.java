package book.chapters.factory.concrete.factory;

import book.chapters.factory.concrete.pizza.CheesePizza;
import book.chapters.factory.concrete.pizza.ClamPizza;
import book.chapters.factory.concrete.pizza.PepperoniPizza;
import book.chapters.factory.concrete.pizza.VeggiePizza;
import book.chapters.factory.idea.Pizza;
import book.chapters.factory.idea.PizzaIngredientFactory;

public class PizzaFactory {
    public Pizza createPizza(String type, String storeName, PizzaIngredientFactory ingredientFactory){
        Pizza pizza = null;
        switch(type){
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName(storeName + " 스타일 치즈 피자");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName(storeName + " 스타일 페퍼로니 피자");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName(storeName + " 스타일 조개 피자");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName(storeName + " 스타일 야채 피자");
                break;
        }

        return pizza;

    }
}
