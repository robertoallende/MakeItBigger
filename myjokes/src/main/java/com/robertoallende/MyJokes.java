package com.robertoallende;

import java.util.ArrayList;
import java.util.Random;

public class MyJokes {

    ArrayList <String> jokes;

    public MyJokes() {
        jokes = new ArrayList();

        // Jokes taken from https://twitter.com/best_jokes
        jokes.add("Two fish are sitting in a tank. One looks over at the other and says: \"Hey, do you know how to drive this thing?\"");
        jokes.add("I told my doctor that I broke my arm in two places. He told me to stop going to those places.");
        jokes.add("Want to hear a construction joke? I'm still working on it.");
        jokes.add("Love may be blind, but marriage is a real eye-opener.");
        jokes.add("Keep the dream alive: Hit the snooze button.");
        jokes.add("Laugh at your problems, everybody else does.");
        jokes.add("Netflix gives you 15 seconds between episodes to decide if you're doing anything with your life today.");
        jokes.add("They say money talks but all mine ever says is \"goodbye\".");
        jokes.add("I named my dog \"5 miles\" so I can tell people I walk 5 miles every day.");
        jokes.add("I don't have an attitude problem. You have a perception problem.");
        jokes.add("What do call two birds in with love? Tweet hearts.!!!");
        jokes.add("The big tomato said to the slow little tomato... ketch up!!");
    }

    public String getJoke() {
        int idx = new Random().nextInt(jokes.size());
        return jokes.get(idx);
    }
}
