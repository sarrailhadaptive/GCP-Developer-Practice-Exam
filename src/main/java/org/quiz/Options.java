package org.quiz;

import java.util.HashMap;

public class Options {
    HashMap<String, Boolean> options = new HashMap<>();

    public void addOption(String answer, boolean correct) {
        options.put(answer,correct);
    }

    @Override
    public String toString() {
        return "Options{" +
                "options=" + options +
                '}';
    }
}
