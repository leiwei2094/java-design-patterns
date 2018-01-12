package com.leibangzhu.designpatterns.decorator;

public class Milk extends Decorator {
    public Milk(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + " added milk";
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 20;
    }
}
