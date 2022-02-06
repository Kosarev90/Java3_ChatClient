package com.geekbrains.lesson2;

public class DivideByZeroException extends Exception {

    public DivideByZeroException() {
        super("Деление ноль, кастомное исключение");
    }
}
