package com.geekbrains.lesson1.part2;

public class Dog extends Animal {

    private final String color;
    private final String type;

    public Dog(String name, String color, String type) {
        super(name);
        this.color = color;
        this.type = type;
    }

    @Override
    public void voice() {
        System.out.println("GAV");
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }
}
