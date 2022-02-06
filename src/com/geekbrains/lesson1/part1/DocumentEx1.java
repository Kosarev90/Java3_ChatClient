package com.geekbrains.lesson1.part1;

public class DocumentEx1 {

    private String title;
    private String content;

    public static void main(String[] args) {
        DocumentEx1 document = new DocumentEx1();
        document.title = "title";
        document.content = "content";

        System.out.println("document.title = " + document.title);
        System.out.println("document.title = " + document.content);
    }
}
