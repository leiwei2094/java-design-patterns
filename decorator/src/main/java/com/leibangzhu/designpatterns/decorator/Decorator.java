package com.leibangzhu.designpatterns.decorator;

// 2. Second level base class with "isa" relationship
public abstract class Decorator implements Widget {
    // 4. "has a" relationship
    private  Widget widget;

    public Decorator(Widget widget){
        this.widget = widget;
    }

    // 5. Delegation
    @Override
    public void draw() {
        widget.draw();
    }
}
