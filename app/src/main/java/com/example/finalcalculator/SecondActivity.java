package com.example.finalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        // retrieving the data that was sent and labeled as NAME
        // there are many methods for getting different data types
        String nameToShow = intent.getStringExtra("Name");
        // getting a reference to the textView in the xml file for THIS activity
        TextView textView = findViewById(R.id.userName);
        // change the text for the textView on this screen
        textView.setText(nameToShow);
    }
}