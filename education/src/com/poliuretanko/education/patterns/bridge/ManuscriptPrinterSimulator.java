package com.poliuretanko.education.patterns.bridge;

import java.util.ArrayList;
import java.util.List;

public class ManuscriptPrinterSimulator {
    public static void main(String[] args) {
        List<Manuscript> manuscripts = new ArrayList<>();
        Formatter formatter = new ForwardFormatter();
        Formatter reversedFormatter = new ReversedFormatter();
        Formatter lengthCuttingFormatter = new LengthCuttingFormatter(50);
        Manuscript book1 = new Book(reversedFormatter, "Jojo", "300 bucks", "Wrong door...");
        Manuscript book2 = new Book(lengthCuttingFormatter, "Mojo", "Piss", "A long time ago in afar, when dragons flown and legends was living around us...");
        List<FAQ.FAQRecord> faqRecords = new ArrayList<>();
        faqRecords.add(new FAQ.FAQRecord("Whatta fuck?!", "Nevermind..."));
        faqRecords.add(new FAQ.FAQRecord("How many apples you cat eat at once?", "A very many."));
        Manuscript faq = new FAQ(formatter, "RTFM", faqRecords);

        manuscripts.add(book1);
        manuscripts.add(book2);
        manuscripts.add(faq);

        manuscripts.forEach( manuscript -> {
            System.out.println("--------------------------");
            System.out.println(manuscript.getPresentation());
        });
    }
}
