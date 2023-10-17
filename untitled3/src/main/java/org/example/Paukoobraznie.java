package org.example;

import java.util.Objects;

// Абстрактный класс Paukoobraznie наследуется от класса Animal и представляет паукообразное животное
public abstract class Paukoobraznie extends Animal {
    private String type;
    private  String mesto;



    // Конструктор класса Paukoobraznie
    public Paukoobraznie(String name, String type, String mesto, int maxRunDistance, int maxSwimDistance) {
        super(name, maxRunDistance, maxSwimDistance);
        this.type = type;
        this.mesto = mesto;
    }

    // Геттер для типа паукообразного животного
    public String getType() {
        return type;
    }

    public String getMesto(){
        return mesto;
    }

    public void habitat() {
        System.out.println(this.type + " " + this.getName() + " место обитания: " + mesto);
//        if (type.equals("Клещ")) System.out.println("Клещ обитает " + mesto);
//        if (type.equals("Скорпион")) System.out.println("Скорпион обитает " + mesto);
//        if (type.equals("Тарантул")) System.out.println("Тарантул обитает "+ mesto);
    }
}