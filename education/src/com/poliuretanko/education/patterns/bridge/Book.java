package com.poliuretanko.education.patterns.bridge;

public class Book implements Manuscript {

    private final Formatter formatter;
    private final String author;
    private final String title;
    private final String text;

    public Book(Formatter formatter, String author, String title, String text) {
        this.formatter = formatter;
        this.author = author;
        this.title = title;
        this.text = text;
    }

    @Override
    public String getPresentation() {
        return formatter.format("Author", author) + "\n" + formatter.format("Title", title) + "\n" + formatter.format("Text", text);
    }
}
