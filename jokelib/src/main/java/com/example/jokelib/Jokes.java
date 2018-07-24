package com.example.jokelib;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jokes {

    private List<String> jokes;

    public Jokes() {
        this.jokes = new ArrayList<>();
        this.jokes.add("Q: What do you call security guards working outside Samsung shops?\n\nA: Guardians of the Galaxy");
        this.jokes.add("Q: Which two letters in the alphabet are always jealous?\n\nA: NV");
        this.jokes.add("Q: Why could the lifeguard not save the hippie?\n\nA: He was too far out man!");
        this.jokes.add("Q: Why don't ants get sick?\n\nA: Because they have little antybodies.");
        this.jokes.add("Q: What's the difference between a hippo and a zippo?\n\nA: One is really heavy, and the other is a little lighter.");
        this.jokes.add("Q: Why do cows have hooves instead of feet?\n\nA: They lactose.");
    }

    public String getJoke() {
        Random rand = new Random();
        return jokes.get(rand.nextInt(jokes.size()));
    }
}
