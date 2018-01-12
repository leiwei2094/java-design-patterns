package com.leibangzhu.designpatterns.decorator;

public abstract class Decorator implements Drink {
    protected Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }
}
