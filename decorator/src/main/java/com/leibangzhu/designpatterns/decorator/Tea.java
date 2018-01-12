package com.leibangzhu.designpatterns.decorator;

public class Tea implements Drink {
    @Override
    public String getDescription() {
        return "Tea";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}
