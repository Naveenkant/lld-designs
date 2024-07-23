package DesignPatterns.decoratorPattern;

import DesignPatterns.decoratorPattern.basePizzas.BasePizza;
import DesignPatterns.decoratorPattern.basePizzas.Margherita;
import DesignPatterns.decoratorPattern.toppings.ExtraCheese;
import DesignPatterns.decoratorPattern.toppings.Jalpeeno;

public class MainClass {
    public static void main(String[] args) {
        BasePizza pizza=new Margherita();
        BasePizza pizzaWithCheese=new ExtraCheese(pizza);
        BasePizza pizzaWithJalpeenoandCheese=new Jalpeeno(pizzaWithCheese);

        System.out.println(pizzaWithCheese.cost());
        System.out.println(pizzaWithJalpeenoandCheese.cost());
    }
}
