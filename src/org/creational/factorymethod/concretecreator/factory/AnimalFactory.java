package org.creational.factorymethod.concretecreator.factory;

import org.creational.factorymethod.concretecreator.object.Animal;
import org.creational.factorymethod.concretecreator.object.Cow;
import org.creational.factorymethod.concretecreator.object.Duck;

public class AnimalFactory {

    public Animal getAnimal(String animal){

        if (animal == null){
            return null;
        }
        else if (animal.equalsIgnoreCase("DUCK")){
            return new Duck();
        }
        else if (animal.equalsIgnoreCase("COW")){
            return new Cow();
        }
        return null;
    }
}
