package org.creational.factorymethod.staticmethodcreator.factory;

import org.creational.factorymethod.staticmethodcreator.object.Animal;
import org.creational.factorymethod.staticmethodcreator.object.Cow;
import org.creational.factorymethod.staticmethodcreator.object.Duck;

public class AnimalFactory {

    public static Animal getAnimal(String animalType) {

        if (animalType == null) {
            return null;
        } else if (animalType.equalsIgnoreCase("DUCK")){
            return new Duck();
        } else if (animalType.equalsIgnoreCase("COW")){
            return new Cow();
        }
        return null;
    }
}
