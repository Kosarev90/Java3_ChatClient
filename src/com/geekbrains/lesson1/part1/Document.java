package com.geekbrains.lesson1.part1;


import java.util.Objects;

public class Document {

    public static final String DEFAULT_TITLE = "Unknown";

    private String title;
    private String content;

    protected String firstName;
    String lastName;

    public Document(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Document(String content) {
        this(DEFAULT_TITLE, content);
    }

    public Document() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Document{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Document document = (Document) object;
        return Objects.equals(title, document.title) && Objects.equals(content, document.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content);
    }
}