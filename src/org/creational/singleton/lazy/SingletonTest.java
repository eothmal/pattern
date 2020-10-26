package org.creational.singleton.lazy;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        singleton1.setData("Test");
        System.out.println("First reference: " + singleton1);
        System.out.println(singleton1.getData());

        //is it the same object?
        Singleton singleton2 = Singleton.getInstance();
        System.out.println("Second reference: " + singleton2);
        System.out.println(singleton2.getData());

    }
}
