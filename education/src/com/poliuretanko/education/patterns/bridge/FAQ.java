package com.poliuretanko.education.patterns.bridge;

import java.util.List;

public class FAQ implements Manuscript {

    private final Formatter formatter;
    private final String title;
    private final List<FAQRecord> records;

    public FAQ(Formatter formatter, String title, List<FAQRecord> records) {
        this.formatter = formatter;
        this.title = title;
        this.records = records;
    }

    @Override
    public String getPresentation() {
        StringBuilder builder = new StringBuilder();
        builder.append(formatter.format("Title", title));
        records.forEach(record -> {
            String formattedQuestion = formatter.format("Question", record.getQuestion());
            String formattedAnswer = formatter.format("Answer", record.getAnswer());
            builder.append("\n").append(formattedQuestion).append(" ").append(formattedAnswer);
        });
        return builder.toString();
    }

    public static class FAQRecord {
        private final String question;
        private final String answer;

        public FAQRecord(String question, String answer) {
            this.question = question;
            this.answer = answer;
        }

        public String getQuestion() {
            return question;
        }

        public String getAnswer() {
            return answer;
        }
    }
}
