package com.company.summative1mwambalaurent.controller;

import com.company.summative1mwambalaurent.model.Definition;
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
public class WordAPI {
    // initiating the definition list
    List<Definition> definitionList = new ArrayList<>(10);

    // generating Random object
    Random random = new Random();

    public WordAPI(){
        // generating the definitions
        definitionList.add(new Definition("hi", "used as an informal way of saying 'hello'"));
        definitionList.add(new Definition("trivia", "unimportant matters"));
        definitionList.add(new Definition("reckon", "to determine by reference to a fixed basis"));
        definitionList.add(new Definition("lit", "slang: affected by alcohol"));
        definitionList.add(new Definition("Kai", "the Melanesian language of the Kai people"));
        definitionList.add(new Definition("slight", "to treat as slight or unimportant"));
        definitionList.add(new Definition("erudite", "having or showing knowledge that is gained by studying"));
        definitionList.add(new Definition("bail", "a container used to remove water from a boat"));
        definitionList.add(new Definition("heriot", "a feudal duty or tribute due under English law to a lord on the death of a tenant"));
        definitionList.add(new Definition("prestige", "the respect and admiration that someone or something gets for being successful or important"));
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    public Definition getWordDefinition(){
        // retuning random word definition from definition list
        return definitionList.get(random.nextInt(10));
    }
}
