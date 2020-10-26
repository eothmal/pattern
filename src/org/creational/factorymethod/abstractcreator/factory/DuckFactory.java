package org.creational.factorymethod.abstractcreator.factory;

import org.creational.factorymethod.abstractcreator.object.Animal;
import org.creational.factorymethod.abstractcreator.object.Duck;

public class DuckFactory extends AbstractAnimalFactory {

    @Override
    protected Animal factoryMethod() {
        return new Duck();
    }
}
