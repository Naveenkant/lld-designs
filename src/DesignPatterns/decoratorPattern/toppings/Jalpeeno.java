package DesignPatterns.decoratorPattern.toppings;

import DesignPatterns.decoratorPattern.basePizzas.BasePizza;

public class Jalpeeno extends ToppingDecorator{
    BasePizza basePizza;
    public Jalpeeno(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return basePizza.cost()+30;
    }
}
