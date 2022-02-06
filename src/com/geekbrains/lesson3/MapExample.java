package com.geekbrains.lesson3;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();

        map.put("Russia", "Moscow");
        map.put("Russia", "Moscow");
        map.put("England", "London");
        map.put("France", "Paris");


        /*Set<String> keySet = map.keySet();
        Collection<String> values = map.values();

        for (String key : keySet) {
            System.out.println("key = " + key);
        }

        System.out.println("=========");

        for (String value : values) {
            System.out.println("value = " + value);
        }

        System.out.println("=========");*/


        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Ключ (страна) " + entry.getKey() + " и значение (столица) " + entry.getValue());
        }

        Map<Person, String> map2 = personStringMap();

        Person oleg = new Person("Oleg", 30);

        System.out.println(map2.get(oleg));

    }


    private static Map<Person, String> personStringMap() {
        Map<Person, String> map = new HashMap<>();

        Person oleg = new Person("Oleg", 30);
        Person nikolay = new Person("Alexey", 35);

        map.put(oleg, "Директор");
        map.put(nikolay, "Зам");

        return map;
    }

}
