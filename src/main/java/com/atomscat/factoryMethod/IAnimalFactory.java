package com.atomscat.factoryMethod;

/**
 * 具体工厂抽象类
 */
public abstract class IAnimalFactory {
    public abstract IAnimal        /*if we cannot instantiate in later stage, we'll throw exception*/
    GetAnimalType(String type) throws Exception;
}
