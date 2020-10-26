package org.creational.abstractfactorymethod.factory;

import org.creational.abstractfactorymethod.object.Animal;
import org.creational.abstractfactorymethod.object.Cow;
import org.creational.abstractfactorymethod.object.Duck;
import org.creational.abstractfactorymethod.object.Food;

public class AnimalFactory extends AbstractFactory{

    @Override
    public Animal getAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("DUCK")){
            return new Duck();
        } else if (animalType.equalsIgnoreCase("COW")){
            return new Cow();
        }
        return null;
    }

    @Override
    public Food getFood(String food) {
        return null;
    }
}
