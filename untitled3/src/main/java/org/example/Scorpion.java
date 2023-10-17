package org.example;

public class Scorpion extends Paukoobraznie{
    public static int count;

    public Scorpion(String name,int maxRunDistance, int maxSwimDistance) {
        super(name, "Скорпион","в пустыне", maxRunDistance, maxSwimDistance);
        count++;
    }
}
