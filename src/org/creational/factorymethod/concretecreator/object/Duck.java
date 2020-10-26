package org.creational.factorymethod.concretecreator.object;

public class Duck implements Animal {
    @Override
    public void move() {
        System.out.println("In Duck ::move() walk and short fly");
    }
}
