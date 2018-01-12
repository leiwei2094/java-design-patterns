package com.leibangzhu.designpatterns.decorator;

public class Demo {
    public static void main(String[] args) {
        Drink drink = new Coffee();

        drink = new Milk(drink);
        drink = new Mongo(drink);
        drink = new Sugar(drink);

        System.out.println(drink.getDescription());
        System.out.println(drink.getPrice());
    }
}
