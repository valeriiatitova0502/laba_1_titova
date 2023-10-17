package org.example;

public class Tarantul extends Paukoobraznie{
    public static int count;

    public Tarantul(String name,int maxRunDistance, int maxSwimDistance) {
        super(name, "Тарантул","в степи", maxRunDistance, maxSwimDistance);
        count++;
    }
}
