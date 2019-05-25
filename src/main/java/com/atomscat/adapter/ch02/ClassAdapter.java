package com.atomscat.adapter.ch02;

public class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() {
        return super.getInteger() +2;
    }
}
