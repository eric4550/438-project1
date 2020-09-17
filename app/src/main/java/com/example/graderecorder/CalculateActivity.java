package com.example.graderecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity {
    TextView ClassSelector;

    TextView Category1;
    TextView Category2;
    TextView Category3;
    TextView Category4;

    EditText Input1;
    EditText Input2;
    EditText Input3;
    EditText Input4;

    Button CalcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        ClassSelector = findViewById(R.id.classText);

        Category1 = findViewById(R.id.gCategory1);
        Category2 = findViewById(R.id.gCategory2);
        Category3 = findViewById(R.id.gCategory3);

        Input1 = findViewById(R.id.gEditText1);
        Input2 = findViewById(R.id.gEditText2);
        Input3 = findViewById(R.id.gEditText3);
        Input4 = findViewById(R.id.gEditText4);

        CalcBtn = findViewById(R.id.calcGradeBtn);


    }


}