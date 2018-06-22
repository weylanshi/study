package com.netty.study.pattern.abstactfactory;

public class Red implements Colors {
    @Override
    public void fill() {
        System.out.println("Red :: fill()");
    }
}
