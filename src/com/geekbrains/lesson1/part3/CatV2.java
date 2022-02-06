package com.geekbrains.lesson1.part3;

import com.geekbrains.lesson1.part2.Animal;

public class CatV2 extends Animal implements Pet {

    private final String color;

    public CatV2(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Cat name is " + super.getName() + "; color - " + this.color);
    }

    @Override
    public void loveMaster() {
        System.out.println("Murrr");
    }

    @Override
    public boolean isUseful() {
        return false;
    }

    @Override
    public void voice() {
        System.out.println("Cat's voice");
    }
}
