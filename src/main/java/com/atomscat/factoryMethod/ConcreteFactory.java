package com.atomscat.factoryMethod;

/**
 * 具体工厂类
 */
public class ConcreteFactory extends IAnimalFactory {
    public IAnimal GetAnimalType(String type) throws Exception {
        switch (type) {
            case "Duck":
                return new Duck();
            case "Tiger":

                return new Tiger();
            default:
                throw new Exception("Animal type : " + type + " cannot be instantiated");
        }
    }
}
