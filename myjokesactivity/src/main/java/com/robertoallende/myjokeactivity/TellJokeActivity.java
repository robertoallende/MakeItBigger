package com.robertoallende.myjokeactivity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TellJokeActivity extends AppCompatActivity {

    static String JOKE = "JOKE";

    public static Intent makeIntent(Context context, String joke) {
        Intent intent = new Intent(context, TellJokeActivity.class);
        intent.putExtra(JOKE, joke);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String joke;

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                joke = "";
            } else {
                joke = extras.getString(JOKE);
            }
        } else {
            joke= (String) savedInstanceState.getSerializable(JOKE);
        }
        setContentView(R.layout.activity_tell_joke);
        TextView jokeView = (TextView) findViewById(R.id.jokeView);
        jokeView.setText(joke);
    }
}
