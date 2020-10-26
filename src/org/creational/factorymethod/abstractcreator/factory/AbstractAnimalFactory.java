package org.creational.factorymethod.abstractcreator.factory;

import org.creational.factorymethod.abstractcreator.object.Animal;

public abstract class AbstractAnimalFactory {

protected abstract Animal factoryMethod();

public Animal getAnimal(){
    return factoryMethod();
}

//other helper method


}
