package com.geekbrains.lesson3.homework;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook implements IPhoneBook {

    private final Map<String, Set<String>> phonesBySurname = new TreeMap<>();

    @Override
    public void add(String surname, String phoneNumber) {
        // 1 вариант
        /*Set<String> phones = phonesBySurname.get(surname);
        if (phones == null) {
            Set<String> phonesSet = new HashSet<>();
            phonesSet.add(phoneNumber);
            phonesBySurname.put(surname, phonesSet);
        } else {
            phones.add(phoneNumber);
            phonesBySurname.put(surname, phones);
        }*/
        // 2 вариант
        Set<String> phones = phonesBySurname.getOrDefault(surname, new HashSet<>());
        phones.add(phoneNumber);
        this.phonesBySurname.put(surname, phones);
    }

    @Override
    public Set<String> get(String surname) {
        return this.phonesBySurname.get(surname);
    }

    @Override
    public Set<String> getAllSurnames() {
        return this.phonesBySurname.keySet();
    }
}
