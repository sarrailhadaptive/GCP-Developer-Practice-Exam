package org.quiz;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

public class Quiz {

    int qNumber = 1;

    final HashMap<Integer, Question> questions = new HashMap<>();

    public Quiz(String quizJsonFile) throws IOException, ParseException {
        buildQuiz(quizJsonFile);
        System.out.println(questions);
    }

    private void buildQuiz(String quizJsonFile) throws IOException, ParseException {
        QuizJsonReader JsonReader = new QuizJsonReader(quizJsonFile);
        JSONArray QuizQuestionsJSON = (JSONArray) JsonReader.getQuizJson().get("questions");

        QuizQuestionsJSON.stream().forEach(x -> {
            JSONObject questionObj = (JSONObject) x;
            String question = (String) questionObj.get("question");
            long numAnswers = (long) questionObj.get("numAnswers");

            JSONArray JSONoptions = (JSONArray) questionObj.get("options");
            Options options = new Options();

            JSONoptions.stream().forEach(o -> {
                JSONObject optionObject = (JSONObject) o;
                String option = (String) optionObject.get("option");
                boolean correct = (Boolean) optionObject.get("correct");
                options.addOption(option,correct);
            });
            addQuestion(new Question(question, numAnswers,options));
        });
    }

    private void addQuestion(Question q) {
        questions.put(qNumber, q);
        qNumber++;
    }


}
