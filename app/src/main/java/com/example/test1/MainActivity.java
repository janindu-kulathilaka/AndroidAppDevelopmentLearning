package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("fail", "it's not working");
    }

    @SuppressLint("SetTextI18n")
    public void toggle(View v) {
        v.setEnabled(false);
        Button button = (Button) v;
        button.setText("Disabled");
        Log.d("Sucess", "Button Disabled");

        TextView text = findViewById(R.id.hello);

        text.setText("hello janindu..");


    }
}