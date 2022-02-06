package com.geekbrains.lesson1.part3;

import com.geekbrains.lesson1.part2.Animal;

public class DogV2 extends Animal implements Pet, Waterfowl {

    private final String color;
    private final String type;

    public DogV2(String name, String color, String type) {
        super(name);
        this.color = color;
        this.type = type;
    }

    @Override
    public void animalInfo() {
        System.out.println("Dog name is " + super.getName() + "; color - " + this.color + "; type - " + this.type);
    }

    @Override
    public void voice() {
        System.out.println("gav");
    }

    @Override
    public void loveMaster() {
        System.out.println("gav gav gav Love you master");
    }

    @Override
    public boolean isUseful() {
        return true;
    }

    @Override
    public int swim() {
        return Waterfowl.DEFAULT_SWIM_LENGTH;
    }
}
