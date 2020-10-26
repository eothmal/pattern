package org.creational.abstractfactorymethod.factory;

import org.creational.abstractfactorymethod.object.Animal;
import org.creational.abstractfactorymethod.object.Corn;
import org.creational.abstractfactorymethod.object.Food;
import org.creational.abstractfactorymethod.object.Grass;

public class FoodFactory extends AbstractFactory{

    @Override
    public Animal getAnimal(String animalType) {
        return null;
    }

    @Override
    public Food getFood(String food) {
        if (food.equalsIgnoreCase("Grass")){
            return new Grass();
        } else if (food.equalsIgnoreCase("CORN")){
            return new Corn();
        }

        return null;
    }
}
