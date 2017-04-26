package com.example.miztli.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LocaleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locale);

        ((TextView)findViewById(R.id.textViewLocale)).setText(getResources().getString(R.string.text_locale));
    }
}
