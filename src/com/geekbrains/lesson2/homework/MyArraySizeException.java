package com.geekbrains.lesson2.homework;

public class MyArraySizeException extends IllegalArgumentException {

    public MyArraySizeException() {
        super("Неверный размер массива, должно быть 4х4");
    }

}
