package org.creational.abstractfactorymethod.object;

public class Grass implements Food{
    @Override
    public void feed() {
        System.out.println("Feed:: Grass as a food");
    }
}
