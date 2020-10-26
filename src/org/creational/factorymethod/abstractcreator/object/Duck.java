package org.creational.factorymethod.abstractcreator.object;

import org.creational.factorymethod.abstractcreator.object.Animal;

public class Duck implements Animal {
    @Override
    public void move() {
        System.out.println("In Duck ::move() walk and short fly");
    }
}
