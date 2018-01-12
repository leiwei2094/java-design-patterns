package com.leibangzhu.designpatterns.decorator;

// 3. "Core" class with "is a" relationship
public class TextField implements Widget {
    private int width;
    private int height;

    public TextField(int width,int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("TextField: " + width + ", " + height);
    }
}
