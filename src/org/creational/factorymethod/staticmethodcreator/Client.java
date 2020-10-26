package org.creational.factorymethod.staticmethodcreator;

import org.creational.factorymethod.staticmethodcreator.factory.AnimalFactory;
import org.creational.factorymethod.staticmethodcreator.object.Animal;

public class Client {
    public static void main(String[] args) {

        //get an object of Animal and call its move method.
        Animal animal1 = AnimalFactory.getAnimal("DUCK");
        animal1.move();

        Animal animal2 = AnimalFactory.getAnimal("COW");
        animal2.move();
    }
}
