package com.netty.study.pattern.abstactfactory;

public abstract class AbstractFactory {

    abstract Colors getColor(String color);

    abstract Shape getShape(String shape);
}
