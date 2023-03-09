package org.quiz;

import org.json.simple.parser.ParseException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        System.out.println("Hello world!");
        new Quiz("questions.json");
    }
}