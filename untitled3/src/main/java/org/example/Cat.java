package org.example;

public class Cat extends Animal {
    public static int count;
    public Cat(String name, int maxRunDistance, int maxSwimDistance) {
        super(name,maxRunDistance, maxSwimDistance);
        count++;
    }

//    public Cat(String name){
//        super(name, 200, 0);
//    }
}