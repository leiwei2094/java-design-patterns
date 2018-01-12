package com.leibangzhu.designpatterns.decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        // 8. Client has the responsibility to compose desired configurations
        Widget widget = new BorderDecorator(new BorderDecorator(new ScrollDecorator(new TextField(80, 24))));
        widget.draw();
    }
}
