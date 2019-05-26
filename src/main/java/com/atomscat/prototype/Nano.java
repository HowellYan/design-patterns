package com.atomscat.prototype;

public class Nano extends BasicCar {
    public Nano(String m) {
        modelname = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
