package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("fail", "it's not working");
    }

//    @SuppressLint("SetTextI18n")
//    public void toggle(View v) {
//        v.setEnabled(false);
//        Button button = (Button) v;
//        button.setText("Disabled");
//        Log.d("Sucess", "Button Disabled");
//
//        TextView text = findViewById(R.id.hello);
//
//        text.setText("hello janindu..");
//
//
//    }

    public void handleText(View v){
        TextView textView = findViewById(R.id.source);
        String input = textView.getText().toString();
        TextView name = findViewById(R.id.nameView);
        name.setText(input);
        Toast.makeText(this, ("Hello " + input), Toast.LENGTH_LONG).show();
    }
}