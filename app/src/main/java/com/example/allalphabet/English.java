package com.example.allalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class English extends AppCompatActivity {
    private Button Home,next;
    private TextView mytext;
    private int value=65;
    private char alphabet='A';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        next = findViewById(R.id.nextButton);
        mytext = findViewById(R.id.englishAlphabet);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value++;
                alphabet = (char)value;
                mytext.setText(""+alphabet);
                if(value==90) {
                    value = 64;
                }
            }
        });


        Home = findViewById(R.id.home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(English.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}