package com.geekbrains.lesson3.homework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task1 {

    private static final String[] INPUT_DATA = {
            "a",
            "b", "b", "b",
            "c",
            "d",
            "e", "e",
            "f",
            "g", "g", "g",
            "h",
            "g",
            "i"
    };

    public static void main(String[] args) {
        Map<String, Integer> frequencyByWord = new LinkedHashMap<>();

        for (String word : INPUT_DATA) {
            // 1 вариант
            /*Integer frequency = frequencyByWord.get(word);
            if (frequency == null) {
                frequency = 0;
            }
            frequencyByWord.put(word, ++frequency);*/
            // 2 вариант
//            Integer frequency = frequencyByWord.getOrDefault(word, 0);
//            frequencyByWord.put(word, frequency + 1);
            // 3 вариант
            frequencyByWord.merge(word, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : frequencyByWord.entrySet()) {
            System.out.printf("Слово %s - встречается %d раз %n", entry.getKey(), entry.getValue());
        }
    }
}
