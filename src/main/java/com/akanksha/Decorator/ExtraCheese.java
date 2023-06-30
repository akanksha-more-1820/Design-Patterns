package com.akanksha.Decorator;

public class ExtraCheese implements ToppingDecorator{

    BasePizza basePizza;
    public ExtraCheese(BasePizza pizza) {
        this.basePizza=pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+20;
    }
}
