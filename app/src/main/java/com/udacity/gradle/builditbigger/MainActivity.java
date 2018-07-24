package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.jokeandroidlibrary.TellMeASillyJoke;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void startJokeActivity(View view) {

        new JokeAsyncTask(new JokeAsyncTask.JokeAsyncTaskCallback() {
            @Override
            public void onJokeRetrieved(String result) {
                if (result != null) {
                    Intent startTellJokeActivity = new Intent(MainActivity.this, TellMeASillyJoke.class);
                    startTellJokeActivity.putExtra(TellMeASillyJoke.JOKE_EXTRA_KEY, result);

                    startActivity(startTellJokeActivity);
                } else {
                    Toast.makeText(MainActivity.this, "Joke could not be loaded", Toast.LENGTH_SHORT).show();
                }
            }
        }).execute();
    }
}
