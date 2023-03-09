package org.quiz;

import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import org.json.simple.parser.*;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class QuizJsonReader {
    JSONObject quizJson;

    public QuizJsonReader(String quizJsonFile) throws IOException, ParseException {
        String rootFolder = System.getProperty("user.dir");
        String filepath = rootFolder + "/" + quizJsonFile;
        Object o = new JSONParser().parse(new FileReader(filepath));
        this.quizJson = (JSONObject) o;
    }

    public JSONObject getQuizJson() {
        return quizJson;
    }
}
