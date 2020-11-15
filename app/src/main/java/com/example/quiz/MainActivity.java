package com.example.quiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    //    score A
    private TextView txt1;
    private Button btn1a, btn2a, btn3a;

//    score b
    private TextView txt2;
    private Button btn1b,btn2b, btn3b;

    private int scoreta, scoretb;
    private Button btnreset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        score a
        txt1 = findViewById(R.id.scorea);
        btn1a = findViewById(R.id.btn1);
        btn2a = findViewById(R.id.btn2);
        btn3a = findViewById(R.id.btn3);

//        score b
        txt2 = findViewById(R.id.scoreb);
        btn1b = findViewById(R.id.btn4);
        btn2b = findViewById(R.id.btn5);
        btn3b = findViewById(R.id.btn6);


        btnreset = findViewById(R.id.btn_reset);


//        score a
        btn3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreta = scoreta + 5;
                txt1.setText("" + scoreta);
            }
        });

        btn2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreta = scoreta + 2;
                txt1.setText("" + scoreta);
            }
        });

        btn1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreta = scoreta + 1;
                txt1.setText("" + scoreta);

            }
        });


        //        score b
        btn1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoretb = scoretb + 1;
                txt2.setText("" + scoretb);

            }
        });

        btn2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoretb = scoretb + 2;
                txt2.setText("" + scoretb);
            }
        });

        btn3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoretb = scoretb + 5;
                txt2.setText("" + scoretb);
            }
        });


        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scoreta = 0;
                txt1.setText("0");

                scoretb = 0;
                txt2.setText("0");
            }
        });

    }
}