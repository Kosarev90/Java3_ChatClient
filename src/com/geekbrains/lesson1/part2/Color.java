package com.geekbrains.lesson1.part2;

public enum Color {

    BLACK("черный"),
    WHITE("белый"),
    GREY("серый"),
    DOTTED("пятнистый");

    private String russianColor;

    Color(String russianColor) {
        this.russianColor = russianColor;
    }

    public String getRussianColor() {
        return russianColor;
    }
}
