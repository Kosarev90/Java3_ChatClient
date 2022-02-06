package com.geekbrains.lesson1.part1;

public class DocumentEx2 {

    private String title;
    private String content;

    public static void main(String[] args) {
        DocumentEx2 document = new DocumentEx2();
        document.title = "title";
        document.content = "content";

        document.printInfo();
    }

    void printInfo() {
        System.out.println(this.title + System.lineSeparator() + this.content);
    }
}
