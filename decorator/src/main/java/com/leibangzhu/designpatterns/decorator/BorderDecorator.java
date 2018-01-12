package com.leibangzhu.designpatterns.decorator;

// 6. Optional embellishment
public class BorderDecorator extends Decorator {
    public BorderDecorator(Widget widget) {
        super(widget);
    }

    public void draw(){
        // 7. Delegate to base class and add extra stuff
        super.draw();
        System.out.println("  BorderDecorator");
    }
}
