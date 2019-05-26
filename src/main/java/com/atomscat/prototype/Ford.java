package com.atomscat.prototype;

public class Ford extends BasicCar {
    public Ford(String m) {
        modelname = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
