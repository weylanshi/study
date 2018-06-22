package com.netty.study.pattern.abstactfactory;

public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        assert shapeFactory != null;
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
    }
}
