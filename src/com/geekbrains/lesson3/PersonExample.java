package com.geekbrains.lesson3;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PersonExample {

    public static void main(String[] args) {
//        Set<Person> personSet = new TreeSet<>(Comparator.comparingInt(Person::getAge));
        Set<Person> personSet = new HashSet<>();

        Person oleg = new Person("Oleg", 30);
        Person nikolay = new Person("Alexey", 35);

        personSet.add(oleg);
        personSet.add(nikolay);

        /*
        * 1. Если 2 объекта равны по equals(), то hashCode() у них одинаковый
        * 2. Если у двух объектов hashCode одинаковый, то они НЕ обязательно равны по equals() (коллизия)
        *
        * */

        System.out.println("personSet.size() = " + personSet.size());

        for (Person person : personSet) {
            System.out.println(person);
        }

    }
}
