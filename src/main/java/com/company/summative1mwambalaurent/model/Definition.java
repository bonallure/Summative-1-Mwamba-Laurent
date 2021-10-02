package com.company.summative1mwambalaurent.model;

/**
 * Created by bonallure on 9/30/21
 */
public class Definition {

    private static int definitionId = 0;
    private String word;
    private String definition;
    private int id;

    public Definition(String word, String definition) {
        this.word = word;
        this.definition = definition;
        this.id = definitionId ++;
    }

    public Definition(){
        this.id = definitionId++;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
