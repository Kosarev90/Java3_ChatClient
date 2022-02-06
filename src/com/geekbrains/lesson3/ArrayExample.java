package com.geekbrains.lesson3;

import java.util.*;

public class ArrayExample {

    public static void main(String[] args) {
        arrayExample();
//        intListExample();
    }

    private static void arrayExample() {
//        int[] arr = new int[4];
        int[] arr = {1, 2, 3, 4};
//        int[] arrNew = new int[0];
//        System.arraycopy(arr, 0, arrNew, 0, arr.length);

        int[] arrNew2 = Arrays.copyOf(arr, 10);

//        arrNew[5] = 5;


        LinkedList<String> stringList = new LinkedList<>();
//        List<String> anotherList = new ArrayList<>();
//        anotherList.add("another string 1");
//        anotherList.add("another string 2");


        stringList.add("строка 1");
        stringList.add("строка 2");
        stringList.add("строка 3");
        stringList.add("строка 4");
        stringList.add("строка 5");
        stringList.add("строка 5");
        stringList.add("строка 5");

        stringList.addFirst("строка 0");
        stringList.addLast("строка 10");

//        stringList.removeFirst();
//        stringList.removeLast();

        System.out.println("stringList.getFirst() = " + stringList.getFirst());
        System.out.println("stringList.getLast() = " + stringList.getLast());

        stringList.add(1, "строка 1 копия");
        stringList.set(1, "строка 1 копия (новая)");
//        stringList.addAll(anotherList);
        System.out.println("stringList.get(5) = " + stringList.get(5));

        System.out.println("stringList.indexOf(\"строка 3\") = " + stringList.indexOf("строка 3"));


        stringList.remove("строка 4");
        stringList.remove(1);

        System.out.println("stringList.size() = " + stringList.size());
        System.out.println("stringList.isEmpty() = " + stringList.isEmpty());

        for (String string : stringList) {
            System.out.println(string);
        }

//        System.out.println("stringList.contains(\"строка 2\") = " + stringList.contains("строка 2"));

    }

    private static void intListExample() {
        List<Object> list = new ArrayList<>();
        list.add("1"); // index = 0
        list.add("2"); // index = 1
        list.add("3"); // index = 2
        list.add("3"); // index = 3
        list.add("3"); // index = 4

        for (Object o : list) {
            System.out.println(o);
        }


        list.removeIf(next -> next.equals("3"));

        System.out.println("======");

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
