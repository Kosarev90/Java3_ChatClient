package com.geekbrains.lesson1.part2;

public abstract class Animal {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println("Animal name is " + this.name);
    }

    public void jump() {
        System.out.println("Animal jumped");
    }

    public abstract void voice();

    public String getName() {
        return name;
    }
}
