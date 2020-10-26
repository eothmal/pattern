package org.creational.factorymethod.abstractcreator.factory;

import org.creational.factorymethod.abstractcreator.object.Animal;
import org.creational.factorymethod.abstractcreator.object.Cow;

public class CowFactory extends AbstractAnimalFactory {

    @Override
    protected Animal factoryMethod() {
        return new Cow();
    }
}
