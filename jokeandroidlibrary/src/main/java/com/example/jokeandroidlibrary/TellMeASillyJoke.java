package com.example.jokeandroidlibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class TellMeASillyJoke extends AppCompatActivity {
    public static final String JOKE_EXTRA_KEY = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tell_me_asilly_joke);

        TextView mJokeTextView = findViewById(R.id.joke_text_view);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra(JOKE_EXTRA_KEY)) {
            String joke = intent.getStringExtra(JOKE_EXTRA_KEY);
            mJokeTextView.setText(joke);
        }

    }
}
