package com.example.miztli.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Changing a text wiew from a button
        //TextView textView = (TextView) findViewById(R.id.textView_welcome);
        //textView.setText(R.string.change_message);
    }
}
