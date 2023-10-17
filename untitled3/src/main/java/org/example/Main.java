// Определение класса Main
package org.example;

// Объявление класса Main
public class Main {
    // Основной метод программы
    public static void main(String[] args) {
        // Создание массива животных, включая котов, собак, тигров, клещей, скорпионов и тарантулов
        Animal[] animals = {
                new Cat("Барсик", 200, 0),
                new Dog("Жучка"),
                new Dog( "Эльза"),
                new Tiger("Адольф", 200, 0),
                new Klesch("Виктор", 10, 0),
                new Scorpion("Варабей", 50, 0),
                new Tarantul("Тарантино", 40, 0)

        };
        // Цикл для каждого животного в массиве
        for (Animal a:animals) {
            // Вызов метода run для каждого животного с параметром 400
            a.run(400);
            // Вызов метода swim для каждого животного с параметром 5
            a.swim(5);
        }
        // Вывод количества животных
        System.out.println("Количество котов " + Cat.count);
        System.out.println("Количество собак " + Dog.count);
        System.out.println("Количество тигров " + Tiger.count);
        System.out.println("Количество клещей " + Klesch.count);
        System.out.println("Количество тарантулов " + Tarantul.count);
        System.out.println("Количество скорпионов " + Scorpion.count);

        System.out.println("Общее количество животных: " + (Cat.count + Dog.count + Tiger.count + Klesch.count + Tarantul.count + Scorpion.count));

        // Вывод среды обитания клеща, скорпиона и тарантула
        ((Paukoobraznie) animals[6]).habitat();
        ((Paukoobraznie) animals[5]).habitat();
        ((Paukoobraznie) animals[4]).habitat();

    }
}