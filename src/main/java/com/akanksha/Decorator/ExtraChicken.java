package com.akanksha.Decorator;

public class ExtraChicken implements ToppingDecorator{
    BasePizza basePizza;
    public ExtraChicken(BasePizza pizza) {
        this.basePizza=pizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() +90;
    }
}
