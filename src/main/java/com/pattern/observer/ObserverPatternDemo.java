package com.pattern.observer;

public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexObserver(subject);
        new OctalObserver(subject);

        System.out.println("first state change :15 ");
        subject.setState(15);
        System.out.println("second state change :10");
        subject.setState(10);

    }

}
