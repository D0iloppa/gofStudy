package book.chapters.factory.idea;

import book.chapters.factory.idea.ingredient.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;


    public abstract void prepare();

    public void bake(){
        System.out.println("175도에서 25분간 굽기");
    };

    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }

    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        // 피자 이름 출력하는 부분
        return getName();
    }
}
