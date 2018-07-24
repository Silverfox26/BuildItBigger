package com.udacity.gradle.builditbigger.backend;

import com.example.jokelib.Jokes;

/**
 * The object model for the data we are sending through endpoints
 */
public class JokeBean {

    private Jokes jokes;

    JokeBean() {
        jokes = new Jokes();
    }

    public String getJoke() {
        return jokes.getJoke();
    }
}