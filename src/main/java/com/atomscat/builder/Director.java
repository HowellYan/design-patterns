package com.atomscat.builder;

/**
 * 主管
 */
public class Director {
    IBuilder myBuilder;

    // A series of steps—for the production
    //组成
    public void Construct(IBuilder builder) {
        myBuilder = builder;
        myBuilder.BuildBody();
        myBuilder.InsertWheels();
        myBuilder.AddHeadlights();
    }
}
