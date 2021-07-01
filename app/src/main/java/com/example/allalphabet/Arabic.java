package com.example.allalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Arabic extends AppCompatActivity {
    private Button Home,next;
    private TextView mycounter;
    private int i= 2;
    private char value='\u0627';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arabic);

        next = findViewById(R.id.nextButton);
        mycounter = findViewById(R.id.arabicAlphabet);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i==1){
                    value='\u0627';
                    mycounter.setText(""+value); i++;
                } else if(i==2){
                    value='\u0628';
                    mycounter.setText(""+value); i++;
                }else if(i==3){
                    value='\u062A';
                    mycounter.setText(""+value); i++;
                }else if(i==4){
                    value='\u062B';
                    mycounter.setText(""+value); i++;
                }else if(i==5){
                    value='\u062C';
                    mycounter.setText(""+value); i++;
                }else if(i==6){
                    value='\u062D';
                    mycounter.setText(""+value); i++;
                }else if(i==7){
                    value='\u062E';
                    mycounter.setText(""+value); i++;
                }else if(i==8){
                    value='\u062F';
                    mycounter.setText(""+value); i++;
                }else if(i==9){
                    value='\u0630';
                    mycounter.setText(""+value); i++;
                }else if(i==10){
                    value='\u0631';
                    mycounter.setText(""+value); i++;
                }else if(i==11){
                    value='\u0632';
                    mycounter.setText(""+value); i++;
                }else if(i==12){
                    value='\u0633';
                    mycounter.setText(""+value); i++;
                }else if(i==13){
                    value='\u0634';
                    mycounter.setText(""+value); i++;
                }else if(i==14){
                    value='\u0635';
                    mycounter.setText(""+value); i++;
                }else if(i==15){
                    value='\u0636';
                    mycounter.setText(""+value); i++;
                }else if(i==16){
                    value='\u0637';
                    mycounter.setText(""+value); i++;
                }else if(i==17){
                    value='\u0638';
                    mycounter.setText(""+value); i++;
                }else if(i==18) {
                    value = '\u0639';
                    mycounter.setText("" + value);
                    i++;
                }else if(i==19){
                    value='\u063A';
                    mycounter.setText(""+value); i++;
                }else if(i==20){
                    value='\u0641';
                    mycounter.setText(""+value); i++;
                }else if(i==21){
                    value='\u0642';
                    mycounter.setText(""+value); i++;
                }else if(i==22){
                    value='\u0643';
                    mycounter.setText(""+value); i++;
                }else if(i==23){
                    value='\u0644';
                    mycounter.setText(""+value); i++;
                }else if(i==24){
                    value='\u0645';
                    mycounter.setText(""+value); i++;
                }else if(i==25){
                    value='\u0646';
                    mycounter.setText(""+value); i++;
                }else if(i==26){
                    value='\u0648';
                    mycounter.setText(""+value); i++;
                }else if(i==27){
                    value='\u0647';
                    mycounter.setText(""+value); i++;
                }else if(i==28){
                    value='\u0622';
                    mycounter.setText(""+value); i++;
                }else if(i==29){
                    value='\u064A';
                    mycounter.setText(""+value); i++;
                }else{
                    value='\u0627';
                    mycounter.setText(""+value); i=1;
                }
            }
        });






        Home = findViewById(R.id.home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Arabic.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}