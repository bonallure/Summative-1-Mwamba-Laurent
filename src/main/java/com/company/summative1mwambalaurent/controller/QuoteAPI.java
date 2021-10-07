package com.company.summative1mwambalaurent.controller;

import com.company.summative1mwambalaurent.model.Quote;
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
public class QuoteAPI {

    // initiating available quotes
    List<Quote> quoteList = new ArrayList<>(10);

    // generating Random object
    Random random = new Random();

    public QuoteAPI(){
        // Generating 10 quotes
        quoteList.add(new Quote("The greatest glory in living lies not in never falling, but in rising every time we fall.", "Nelson Mandela"));
        quoteList.add(new Quote("If life were predictable it would cease to be life, and be without flavor.", "Eleanor Roosevelt"));
        quoteList.add(new Quote("Reality is wrong. Dreams are for real.", "Tupac Shakur"));
        quoteList.add(new Quote("It does not matter how slowly you go as long as you do not stop.", "Confucius"));
        quoteList.add(new Quote("Nothing is impossible, the word itself says, `I'm possible!'.", "Audrey Hepburn"));
        quoteList.add(new Quote("I have learned over the years that when one's mind is made up, this diminishes fear.", "Rosa Parks"));
        quoteList.add(new Quote("Believe you can and you're halfway there.", "Theodore Roosevelt"));
        quoteList.add(new Quote("Try not to become a man of success. Rather become a man of value.", "Albert Einstein"));
        quoteList.add(new Quote("It is better to fail in originality than to succeed in imitation.", "Herman Melville"));
        quoteList.add(new Quote("I'm just a regular degular shmegular girl from the Bronx", "Belcalis Almánzar"));

    }

    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote getQuote(){
        // returning random quote from quote list
        return quoteList.get(random.nextInt(10));
    }
}
