package com.geekbrains.lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FinallyExample {

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("test_lesson2.txt");
            byte[] bytes = fileInputStream.readAllBytes();
            String text = new String(bytes);
            System.out.println(text);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не был найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Файл поврежден");
        } finally {
            System.out.println("Finally 1");
            try {
                System.out.println("Finally 2");
                fileInputStream.close();
                System.exit(1);
                System.out.println("Finally 3");
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Finally 4");
        }
    }
}
