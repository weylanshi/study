package com.pattern.single;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();

        EnumSingleObject.INSTANCE.showMessage();
    }
}
