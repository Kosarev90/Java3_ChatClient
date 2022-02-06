package com.geekbrains.lesson3.homework;

import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "123");
        phoneBook.add("Иванов", "456");
        phoneBook.add("Иванов", "456");

        phoneBook.add("Петров", "777");
        phoneBook.add("Сидоров", "999");

        Set<String> allSurnames = phoneBook.getAllSurnames();

        for (String surname : allSurnames) {
            System.out.printf("Пользователь %s имеет номер(а) телефона %s %n", surname, phoneBook.get(surname));
        }
    }
}
