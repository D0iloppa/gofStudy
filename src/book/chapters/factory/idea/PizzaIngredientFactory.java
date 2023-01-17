package book.chapters.factory.idea;

import book.chapters.factory.idea.ingredient.*;

public interface PizzaIngredientFactory {
    /*
       [factory의 조건]
         1. 인터페이스(혹은 추상클래스)의 구현체
         2. 팩토리는 구상 클래스여야 한다.
    */

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();
    public Clams createClam();
}
