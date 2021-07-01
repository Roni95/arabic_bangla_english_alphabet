package com.example.allalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private Button English,Arabic,Bangla;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bangla = findViewById(R.id.bangla);

        Bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bn = new Intent(MainActivity.this,Bangla.class);
                startActivity(bn);
            }
        });


        English = findViewById(R.id.english);

        English.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, English.class);

                startActivity(intent);
            }
        });

        Arabic = findViewById(R.id.arabic);

        Arabic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ar = new Intent(MainActivity.this,Arabic.class);
                startActivity(ar);


            }
        });

    }
}