package com.example.and;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivityAnd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_and);

        if (getIntent() != null) {
            String joke = getIntent().getStringExtra("joke");
            TextView jokeText = findViewById(R.id.txtand);
            jokeText.setText(joke);
        }
    }
}
