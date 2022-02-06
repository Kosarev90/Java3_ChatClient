package com.geekbrains.lesson3;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {
        setExample();
    }

    private static void setExample() {
        Set<String> set = new TreeSet<>();


        set.add("Альфа");
        set.add("Альфа");
        set.add("Гамма");
        set.add("Эта");
        set.add("Эпсилон");
        set.add("Омега");
        set.add("Бета");
        set.add("Альфа");

        for (String s : set) {
            System.out.println(s);
        }

    }
}
