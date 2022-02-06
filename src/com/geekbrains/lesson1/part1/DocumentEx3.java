package com.geekbrains.lesson1.part1;

public class DocumentEx3 {

    private String title;
    private String content;

    public DocumentEx3(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public DocumentEx3(String content) {
        this.title = "default title";
        this.content = content;
    }

    public DocumentEx3(String title, String content, boolean needToLog) {
        this.title = title;
        this.content = content;
        if (needToLog) {
            System.out.println("object has been created");
        }
    }

    public static void main(String[] args) {
        DocumentEx3 documentEx3 = new DocumentEx3("title", "content", true);
    }

    void printInfo() {
        System.out.println(this.title + System.lineSeparator() + this.content);
    }
}
