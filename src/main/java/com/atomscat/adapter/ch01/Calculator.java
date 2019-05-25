package com.atomscat.adapter.ch01;

public class Calculator {
    Rect rectangle;

    public double getArea(Rect r) {
        rectangle = r;
        return rectangle.l * rectangle.w;
    }
}
