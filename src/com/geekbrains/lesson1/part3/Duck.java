package com.geekbrains.lesson1.part3;

import com.geekbrains.lesson1.part2.Animal;

public class Duck extends Animal implements Pet, Waterfowl {

    public static final int SWIM_LENGTH = 150;

    public Duck(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println("Кря");
    }

    @Override
    public void loveMaster() {
        System.out.println("Love you, Master");
    }

    @Override
    public boolean isUseful() {
        return true;
    }

    @Override
    public int swim() {
        System.out.println("Duck is swimming");

        return SWIM_LENGTH;
    }

    @Override
    public void printSomeInfo() {
        Waterfowl.super.printSomeInfo();
    }
}
