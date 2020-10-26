package org.creational.factorymethod.concretecreator.object;

public class Cow implements Animal {
    @Override
    public void move() {
        System.out.println("In Cow ::move()  walk");
    }
}
