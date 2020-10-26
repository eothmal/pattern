package org.creational.factorymethod.abstractcreator.object;

import org.creational.factorymethod.abstractcreator.object.Animal;

public class Cow implements Animal {
    @Override
    public void move() {
        System.out.println("In Cow ::move()  walk");
    }
}
