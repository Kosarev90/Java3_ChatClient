package com.geekbrains.lesson1.part2;

public class TestAnimal {

    public static void main(String[] args) {
        Animal cat = new Cat("Milky", Color.WHITE, new Cat.CatAttribute());
        Cat cat2 = new Cat("Milky", Color.WHITE, new Cat.CatAttribute());
        Animal dog = new Dog("Archy", "black", "shepherd");

//        cat.animalInfo();
//        System.out.println("===");
//        dog.animalInfo();
//
//        System.out.println(Utils.multiply(2));
//
//        cat2.getCatAttribute();
//
//        Cat.CatAttribute catAttribute = ((Cat) cat).getCatAttribute();

//        System.out.println(cat instanceof Cat);
//        System.out.println(cat instanceof Animal);
//        System.out.println(cat instanceof Object);

        int a = 4;
        byte b = (byte) a;

        byte b1 = 7;
        int a1 = b1;

        int a2 = 258;
        byte b2 = (byte) a2;
        System.out.println(b2);

        int a3 = 'A' + 5;
        System.out.println("a3 = " + a3);
    }
}
