package org.example;

public class Dog extends Animal{
    private static int maxRunDistance = 500;
    private static int maxSwimDistance = 10;
    public static int count;
    public Dog(String name) {
        super(name,maxRunDistance, maxSwimDistance);
        count++;
    }
    //    public Dog(String name) {
//        super(name, 500, 10);
//    }
}