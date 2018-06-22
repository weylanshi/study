package com.netty.study.pattern.abstactfactory;

public class Green implements  Colors {
    @Override
    public void fill() {
        System.out.println("green :: fill() ");
    }
}
