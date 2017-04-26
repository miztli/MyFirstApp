package com.example.miztli.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        //Get the intent that tarted this activity and extract the string
        Intent intent = getIntent();

        TextView textView = (TextView) findViewById(R.id.textViewMessage);
        textView.setText("Message recieved: " + intent.getStringExtra(MainActivity.EXTRA_MESSAGE));
    }
}
