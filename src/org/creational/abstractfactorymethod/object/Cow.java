package org.creational.abstractfactorymethod.object;

public class Cow implements Animal {
    @Override
    public void move() {
        System.out.println("In Cow ::move()  walk");
    }
}
