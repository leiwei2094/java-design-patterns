package com.leibangzhu.designpatterns.decorator;

public class Mongo extends Decorator {
    public Mongo(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ",added mongo";
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 15;
    }
}
