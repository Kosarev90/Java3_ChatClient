package com.geekbrains.lesson2.homework;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(String cellValue, int rowIndex, int colIndex) {
        super(String.format("Неверное значение '%s' в ячейке[%d][%d]", cellValue, rowIndex, colIndex));
    }

}
