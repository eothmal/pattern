package org.creational.factorymethod.concretecreator;

import org.creational.factorymethod.concretecreator.factory.AnimalFactory;
import org.creational.factorymethod.concretecreator.object.Animal;

public class Client {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        //get an object of Duck and call its move method.
        Animal animal1 = animalFactory.getAnimal("DUCK");
        animal1.move();

        //get an object of Cow and call its move method.
        Animal animal2 = animalFactory.getAnimal("COW");
        animal2.move();

    }
}
