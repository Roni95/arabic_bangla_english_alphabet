package com.example.allalphabet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bangla extends AppCompatActivity {
    private Button Home,next;
    private TextView mycounter;
    private int value = 1,valuee=0;
    private char ch ='\u0985',c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla);

        mycounter = findViewById(R.id.banglaAlphabet);
        next = findViewById(R.id.nextButton);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (value == 1){
                    ch = '\u0986';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value == 2){
                    ch = '\u0987';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value == 3){
                    ch = '\u0988';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value == 4){
                    ch = '\u0989';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value == 5){
                    ch = '\u098A';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value == 6){
                    ch = '\u098B';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value == 7){
                    ch = '\u098C';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value == 8){
                    ch = '\u098F';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value == 9){
                    ch = '\u0990';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value == 10){
                    ch = '\u0993';
                    value ++ ;
                    mycounter.setText(""+ch);
                }
                else if(value==11){
                    ch = '\u0994';
                    value ++;
                    mycounter.setText(""+ch);
                }else if(value==12) {
                    if(valuee==0){
                        c = '\u0995';
                        valuee++;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 1){
                        c = '\u0996';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 2){
                        c = '\u0997';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 3){
                        c = '\u0998';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 4){
                        c = '\u0999';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 5){
                        c = '\u099A';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 6){
                        c = '\u099B';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 7){
                        c = '\u099C';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 8){
                        c = '\u099D';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 9){
                        c = '\u099E';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 10){
                        c = '\u099F';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 11){
                        c = '\u09A0';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }else if(valuee == 12){
                        c = '\u09A1';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 13){
                        c = '\u09A2';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 14){
                        c = '\u09A3';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 15){
                        c = '\u09A4';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 16){
                        c = '\u09A5';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }else if(valuee == 17){
                        c = '\u09A6';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 18){
                        c = '\u09A7';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 19){
                        c = '\u09A8';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 20){
                        c = '\u09AA';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 21){
                        c = '\u09AB';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 22){
                        c = '\u09AC';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 23){
                        c = '\u09AD';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 24){
                        c = '\u09AE';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 25){
                        c = '\u09AF';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 26){
                        c = '\u09B0';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 27){
                        c = '\u09B2';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 28){
                        c = '\u09B6';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 29){
                        c = '\u09B7';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 30){
                        c = '\u09B8';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }else if(valuee == 31){
                        c = '\u09B9';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 32){
                        c = '\u09DC';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 33){
                        c = '\u09DD';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 34){
                        c = '\u09DF';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 35){
                        c = '\u09FB';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }else if(valuee == 36){
                        c = '\u09FC';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee == 37){
                        c = '\u09FD';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    }
                    else if(valuee==38){
                        c = '\u09FA';
                        valuee ++ ;
                        mycounter.setText(""+c);
                    } else{
                        valuee=1;
                        value++;
                    }
                }


                else{
                    ch = '\u0985';
                    value++;
                    mycounter.setText(""+ch);
                }
            }
        });




        Home = findViewById(R.id.home);
        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bangla.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}