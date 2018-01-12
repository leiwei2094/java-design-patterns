package com.leibangzhu.designpatterns.decorator;

// 6. Optional embellishment
public class ScrollDecorator extends Decorator {
    public ScrollDecorator(Widget widget) {
        super(widget);
    }

    public void draw(){
        super.draw(); // 7. Delegate to base class and add extra stuff
        System.out.println("  ScrollDecorator");
    }
}
