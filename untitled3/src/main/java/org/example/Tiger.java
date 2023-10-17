package org.example;

class Tiger extends Animal{
    public static int count;
    public Tiger(String name, int maxRunDistance, int maxSwimDistance) {
        super(name,maxRunDistance, maxSwimDistance);
        count++;
    }
}
