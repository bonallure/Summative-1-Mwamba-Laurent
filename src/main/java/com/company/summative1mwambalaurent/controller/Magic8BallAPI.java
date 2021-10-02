package com.company.summative1mwambalaurent.controller;

import com.company.summative1mwambalaurent.model.Answer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by bonallure on 9/30/21
 */
@RestController
public class Magic8BallAPI {
    // initiating the answer list
    List<Answer> answerList = new ArrayList<>(10);

    // generating Random object
    Random random = new Random();

    public Magic8BallAPI(){
        // generating the Answers
        answerList.add(new Answer("The absolute value of of ascii code A minus fifty."));
        answerList.add(new Answer("In Tokyo during the fall."));
        answerList.add(new Answer("To help the heart live longer."));
        answerList.add(new Answer("Working in coltan mines in the Democratic Republic of Congo."));
        answerList.add(new Answer("Una oruga convirtiendose en una mariposa."));
        answerList.add(new Answer("Monday, January 11th 1991, in Houston, Texas, at 1:23pm CDT."));
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    public Answer getAnswer(@RequestBody String question){
        // retuning random word definition from definition list
        Answer answer = answerList.get(random.nextInt(10));
        answer.setQuestion(question);

        return answer;
    }
}
