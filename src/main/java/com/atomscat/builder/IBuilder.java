package com.atomscat.builder;

public interface IBuilder {
    void BuildBody();

    void InsertWheels();

    void AddHeadlights();

    Product GetVehicle();

}
