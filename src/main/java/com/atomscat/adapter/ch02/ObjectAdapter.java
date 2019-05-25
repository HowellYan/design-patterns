package com.atomscat.adapter.ch02;

public class ObjectAdapter {
    private IIntegerValue myInt;

    public ObjectAdapter(IIntegerValue myInt) {
        this.myInt = myInt;
    }
    //Incrementing by 2

    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }

}
