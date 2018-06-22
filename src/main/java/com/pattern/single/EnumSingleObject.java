package com.pattern.single;

public enum EnumSingleObject {

    INSTANCE;

    public void showMessage(){
        System.out.println("EnumSingleObject Hello World");
    }
}
