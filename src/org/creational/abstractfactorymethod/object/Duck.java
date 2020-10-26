package org.creational.abstractfactorymethod.object;

public class Duck implements Animal {
    @Override
    public void move() {
        System.out.println("In Duck ::move() walk and short fly");
    }
}
