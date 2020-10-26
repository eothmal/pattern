package org.creational.abstractfactorymethod.factory;


import org.creational.abstractfactorymethod.object.Animal;
import org.creational.abstractfactorymethod.object.Food;

public abstract class AbstractFactory {
    public abstract Animal getAnimal(String animalType);
    public abstract Food getFood(String food);
}
