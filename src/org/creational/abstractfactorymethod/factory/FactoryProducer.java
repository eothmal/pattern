package org.creational.abstractfactorymethod.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("ANIMAL")){

        return new AnimalFactory();
        } else if (choice.equalsIgnoreCase("FOOD")){
            return new FoodFactory();
        }
        return null;
    }
}
