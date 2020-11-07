package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txt1;
    private TextView txt2;
    private Button btn1a;
    private Button btn1b;

    private int scoreta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1= findViewById(R.id.scorea);
        txt2=findViewById(R.id.scoreb);

        btn1a=findViewById(R.id.btn1);
        btn1b=findViewById(R.id.btn4);

        btn1a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreta=scoreta+3;
                txt1.setText(""+scoreta);

            }
        });

    }
}