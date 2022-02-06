package com.geekbrains.lesson1.part2;

public class Test {

    public static final int MONTH_MAY = 5;

    public static void main(String[] args) {
        Color black = Color.BLACK;

        Color white = Color.valueOf("WHITE");

        for (Color value : Color.values()) {
            System.out.println(value.getRussianColor());
        }
    }

}
