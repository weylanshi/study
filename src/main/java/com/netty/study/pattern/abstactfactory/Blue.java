package com.netty.study.pattern.abstactfactory;

public class Blue implements Colors {
    @Override
    public void fill() {
        System.out.println("Blue :: fill()");
    }
}
