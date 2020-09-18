package com.example.graderecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculateActivity extends AppCompatActivity {
    TextView ClassSelector;
    TextView gradeView;

    TextView a1;
    TextView a2;
    TextView a3;
    TextView a4;

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
        gradeView = findViewById(R.id.grade);

        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        a3 = findViewById(R.id.a3);
        a4 = findViewById(R.id.a4);

        Input1 = findViewById(R.id.s1);
        Input2 = findViewById(R.id.s2);
        Input3 = findViewById(R.id.s3);
        Input4 = findViewById(R.id.s4);

        CalcBtn = findViewById(R.id.calcGradeBtn);


        CalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int score = 0;
                char grade = ' ';

                score += Integer.parseInt(Input1.getText().toString());
                score += Integer.parseInt(Input2.getText().toString());
                score += Integer.parseInt(Input3.getText().toString());
                score += Integer.parseInt(Input4.getText().toString());

                float percentage = score / 400;

                if(percentage >= 0.90) {
                    grade = 'A';
                } else if(grade >= 0.8 && grade < 0.9) {
                    grade = 'B';
                } else if (grade >= 0.7 && grade < 0.8) {
                    grade = 'C';
                } else if(grade >= 0.6 && grade < 0.7) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }

                gradeView.setText("Grade: " + grade);

            }
        });

    }


}