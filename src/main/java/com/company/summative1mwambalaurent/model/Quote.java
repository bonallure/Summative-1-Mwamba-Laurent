package com.company.summative1mwambalaurent.model;


/**
 * Created by bonallure on 9/30/21
 */
public class Quote {

    private static int quoteId = 0;
    private int id;
    private String author;

    private String quote;

    public Quote(String quote){
        this.quote = quote;
        this.id = quoteId++;
    }

    public Quote(String quote, String author){
        this.quote = quote;
        this.author = author;
        this.id = quoteId++;
    }

    public Quote(){
        this.id = quoteId++;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }
}
