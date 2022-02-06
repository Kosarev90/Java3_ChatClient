package com.geekbrains.lesson1.part2;

public class Cat extends Animal {

    private final Color color;
    private CatAttribute catAttribute;

    public static class CatAttribute {
        private String meal;
        private int weight;
        private Color eyesColor;
    }

    public Cat(String name, Color color, CatAttribute catAttribute) {
        super(name);
        this.color = color;
        this.catAttribute = catAttribute;
    }

    @Override
    public void voice() {
        System.out.println("Mew");
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Cat name is " + super.getName() + "; color - " + this.color);
    }

    public CatAttribute getCatAttribute() {
        return catAttribute;
    }
}
