package org.creational.factorymethod.abstractcreator;

import org.creational.factorymethod.abstractcreator.factory.CowFactory;
import org.creational.factorymethod.abstractcreator.factory.DuckFactory;
import org.creational.factorymethod.abstractcreator.object.Animal;

public class Client {
    public static void main(String[] args) {

        Animal animal1 = new DuckFactory().getAnimal();
        animal1.move();

        Animal animal2 = new CowFactory().getAnimal();
        animal2.move();
    }
}
