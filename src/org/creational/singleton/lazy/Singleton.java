package org.creational.singleton.lazy;

public class Singleton {

    // the private reference to the one and only instance
    private static Singleton uniqueInstance = null;

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    private Singleton() {
    }

//    @Override
//    public String toString() {
//        return "Singleton{" +
//                "data='" + data + '\'' +
//                '}';
//    }
}
