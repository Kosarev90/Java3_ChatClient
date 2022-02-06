package com.geekbrains.lesson1.part3;

public class TestRiver {
    public static void main(String[] args) {
        River volgaRiver = new River("Volga", 100);

        Waterfowl dog = new DogV2("Jack", "black", "ovcharka");
        Waterfowl duck = new Duck("Duck");

        Pet cat = new CatV2("cat", "white");

//        System.out.println("river.canSwim(dog) = " + volgaRiver.canSwim(dog));
//        System.out.println("river.canSwim(duck) = " + volgaRiver.canSwim(duck));

//        System.out.println("river.canSwim(duck) = " + volgaRiver.canSwim(cat));

        Waterfowl[] waterfowls = {
                new DogV2("Jack", "black", "ovcharka"),
                new Duck("Duck")
        };

//        canSwim(volgaRiver, dog, duck);
        canSwimArray(volgaRiver, waterfowls);
    }

    private static void canSwim(River river, Waterfowl ...waterfowls) {
        for (Waterfowl waterfowl : waterfowls) {
            System.out.println(waterfowl);
            System.out.println(river.canSwim(waterfowl));
        }
    }

    private static void canSwimArray(River river, Waterfowl[] waterfowls) {
        for (Waterfowl waterfowl : waterfowls) {
            System.out.println(waterfowl);
            System.out.println(river.canSwim(waterfowl));
        }
    }
}
