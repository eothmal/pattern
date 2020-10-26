package org.creational.abstractfactorymethod;

import org.creational.abstractfactorymethod.factory.AbstractFactory;
import org.creational.abstractfactorymethod.factory.FactoryProducer;
import org.creational.abstractfactorymethod.object.Animal;
import org.creational.abstractfactorymethod.object.Food;

public class Client {
    public static void main(String [] args)
    {
        //get shape factory
        AbstractFactory animalFactory = FactoryProducer.getFactory("ANIMAL");

        //get an object of Animal Duck
        Animal animal1 = animalFactory.getAnimal("DUCK");

        //call move method of Animal Duck
        animal1.move();

        Animal animal2 = animalFactory.getAnimal("COw");
        animal2.move();


        //get food factory
        AbstractFactory foodFactory = FactoryProducer.getFactory("FOOD");

        //get an object of Color Red
        Food food1 = foodFactory.getFood("CORN");

        //call feed method of Ant
        food1.feed();

        Food food2 = foodFactory.getFood("Grass");
        food2.feed();


    }
}
