package com.example.finalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void findSum(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberSumTV = findViewById(R.id.resultTV);
        TextView comment = findViewById(R.id.commentCode);
        comment.setText("");

        double num1;
        double num2;
        double sum = 0;
        try {
            num1 = Integer.parseInt(number1ET.getText().toString());
            num2 = Integer.parseInt(number2ET.getText().toString());
            sum = num1 + num2;
        } catch (Exception e) {
            comment.setText("Please enter a valid integer and try again.");
        }

        numberSumTV.setText("" + sum);
    }

    public void findDifference(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberDifferenceTV = findViewById(R.id.resultTV);
        TextView comment = findViewById(R.id.commentCode);
        comment.setText("");

        double num1;
        double num2;
        double difference = 0;
        try {
            num1 = Integer.parseInt(number1ET.getText().toString());
            num2 = Integer.parseInt(number2ET.getText().toString());
            difference = num1 - num2;
        } catch (Exception e){
            comment.setText("Please enter a valid integer and try again.");
        }

        numberDifferenceTV.setText("" + difference);
    }

    public void findProduct(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberProductTV = findViewById(R.id.resultTV);
        TextView comment = findViewById(R.id.commentCode);
        comment.setText("");

        double num1;
        double num2;
        double product = 0;
        try{
            num1 = Integer.parseInt(number1ET.getText().toString());
            num2 = Integer.parseInt(number2ET.getText().toString());
            product = num1 * num2;
        } catch (Exception e){
            comment.setText("Please enter a valid integer and try again.");
        }

        numberProductTV.setText("" + product);
    }

    public void findQuotient(View view){
        EditText number1ET = findViewById(R.id.num1ET);
        EditText number2ET = findViewById(R.id.num2ET);
        TextView numberQuotientTV = findViewById(R.id.resultTV);
        TextView comment = findViewById(R.id.commentCode);
        comment.setText("");

        double num1;
        double num2;
        double quotient = 0;
        try {
            num1 = Integer.parseInt(number1ET.getText().toString());
            num2 = Integer.parseInt(number2ET.getText().toString());
            quotient = num1 / num2;
        } catch (Exception e){
            comment.setText("Please enter a valid integer and try again.");
        }

        numberQuotientTV.setText("" + quotient);
    }

}

