package com.atomscat.flyweight.ch02;

public class Robot implements IRobot {
    public String colorOfRobot;
    String robotType;

    public Robot(String robotType) {
        this.robotType = robotType;
    }

    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }

    @Override
    public void Print() {
        System.out.println(" This is a " + robotType + " type robot with " + colorOfRobot + "color");
    }
}
