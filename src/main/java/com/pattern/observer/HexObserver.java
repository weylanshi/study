package com.pattern.observer;

public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(" Hex string : "+Integer.toHexString(subject.getState()).toUpperCase());
    }
}
