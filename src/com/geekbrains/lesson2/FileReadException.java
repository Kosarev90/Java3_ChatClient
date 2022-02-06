package com.geekbrains.lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadException {

    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("test_lesson2.txt")) {
            byte[] bytes = fileInputStream.readAllBytes();
            String text = new String(bytes);
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Файл поврежден");
        }
    }
}
