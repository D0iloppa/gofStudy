package book.chapters.factory.concrete.pizza;

import book.chapters.factory.idea.Pizza;
import book.chapters.factory.idea.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory factory){
        this.ingredientFactory = factory;
    }
    public void prepare(){
        System.out.println("준비 중 : " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
