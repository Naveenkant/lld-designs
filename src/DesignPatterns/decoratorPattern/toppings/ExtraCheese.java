package DesignPatterns.decoratorPattern.toppings;

import DesignPatterns.decoratorPattern.basePizzas.BasePizza;

public class ExtraCheese extends ToppingDecorator{

    BasePizza basePizza;
    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+40;
    }
}
