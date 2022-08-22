package com.example.finalcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void switchScreens(View view){
        // Create a reference within the java file for this screen to the
        //xml file for the design elements displayed on the screen
        // This will only work if you have an element of this type and
        // this id within the xml file that you referenced in the onCreate

        EditText editText = findViewById(R.id.enteredName);
        String name = editText.getText().toString();

        /*
        To send the app to another screen, you need to create an Intent.
        This is equivalent to getting out a new envelope to mail a letter.
        In the constructor, the first param is telling you where you are coming
        from, and we usually use this because we are coming from this screen

        The second param tells you which activity you are going to, and you need
        to use the ActivityName.class

        After you create the intent, if you want to send data with it, you need
        to use putExtra and the first param is a label, usually all caps, and
        the second param is the value you are sending.

        Lastly, you call startActivity to launch the new intent and switch screens.
         */

        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("NAME",name);
        startActivity(intent);
    }
}