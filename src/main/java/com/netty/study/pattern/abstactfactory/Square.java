package com.netty.study.pattern.abstactfactory;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square :: draw()");
    }
}
