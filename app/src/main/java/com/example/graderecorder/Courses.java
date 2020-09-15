package com.example.graderecorder;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class Courses extends AppCompatActivity {

    Button spanishBTN;
    Button cstBTN;
    Button mathBTN;
    Button englishBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        spanishBTN = findViewById(R.id.spanishBtn);
        cstBTN = findViewById(R.id.CSTbtn);
        mathBTN = findViewById(R.id.mathBtn);
        englishBTN = findViewById(R.id.englishBtn);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        spanishBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                openCalculator();
            }
        });


        cstBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                openCalculator();
            }
        });


        mathBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                openCalculator();
            }
        });


        englishBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                openCalculator();
            }
        });
    }
}

//public void openCalculator(){
//    Intent Start
//}