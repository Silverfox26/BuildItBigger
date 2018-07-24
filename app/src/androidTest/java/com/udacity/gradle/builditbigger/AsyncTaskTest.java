package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    /**
     * Test if the AsyncTask successfully returns a joke from the GCE
     */
    @Test
    public void jokeAsyncTaskReturnsJokeTest() {
        String jokeResult = null;
        JokeAsyncTask jokeAsyncTask = new JokeAsyncTask(null);
        jokeAsyncTask.execute();
        try {
            jokeResult = jokeAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(jokeResult);
    }
}