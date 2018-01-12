package com.leibangzhu.designpatterns.decorator;

public class Sugar extends Decorator {
    public Sugar(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ",added sugar";
    }

    @Override
    public double getPrice() {
        return drink.getPrice() + 2;
    }
}
