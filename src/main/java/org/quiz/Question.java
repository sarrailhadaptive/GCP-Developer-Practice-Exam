package org.quiz;

import java.util.HashMap;

public class Question {
    final String question;

    final long numAnswers;

    final Options options;

    public Question(String question, long numAnswers, Options options) {
        this.question = question;
        this.numAnswers = numAnswers;
        this.options = options;
    }

    public String getQuestion() {
        return question;
    }

    public long getNumAnswers() {
        return numAnswers;
    }

    public Options getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", numAnswers=" + numAnswers +
                ", options=" + options +
                '}';
    }
}
