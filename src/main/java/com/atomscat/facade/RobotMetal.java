package com.atomscat.facade;

/**
 * 金属
 */
public class RobotMetal {
    private String metal;

    public void SetMetal(String metal) {
        this.metal = metal;
        System.out.println("Metal is set to : " + this.metal);
    }
}
