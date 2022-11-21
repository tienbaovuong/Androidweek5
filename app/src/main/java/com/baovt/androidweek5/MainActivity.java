package com.baovt.androidweek5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView counterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counterText = findViewById(R.id.counter_text);

        //state restore
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("counter");
            counterText.setText(String.valueOf(count));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counter", count);
    }

    public void countUp(View view) {
        count++;
        if (counterText != null)
            counterText.setText(String.valueOf(count));
    }
}