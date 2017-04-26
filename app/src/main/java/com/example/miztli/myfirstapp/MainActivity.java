package com.example.miztli.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Is a good practice to use your app's package name as a prefix
    //This ensures the keys are unique, in case your app interacts with other apps.
    public static final String EXTRA_MESSAGE = "com.example.miztli.myfirstapp.example_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view){
        String name = ((TextView)findViewById(R.id.editTextHelloWorld)).getText().toString();
        ((TextView)findViewById(R.id.textView_welcome)).setText("Welcome: " + name + "!");
    }

    public void startAnotherActivity(View view){
        Intent intent = new Intent(this, AnotherActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextAnotherActivity);
        intent.putExtra(EXTRA_MESSAGE, editText.getText().toString());
        startActivity(intent);
    }
}
