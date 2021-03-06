package com.example.graderecorder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.graderecorder.DB.GradeDatabase;
import com.example.graderecorder.DB.GradeIDDAO;
import com.example.graderecorder.DB.UserDatabase;

public class CalculateActivity extends AppCompatActivity {
    private User user;
    private GradeCategory gradeCategory;

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

    private GradeIDDAO gradeIDDAO;

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


//        gradeIDDAO = Room.databaseBuilder(this, GradeDatabase.class,"User").allowMainThreadQueries().build().getGradeIDDAO();
        gradeIDDAO = Room.databaseBuilder(this, GradeDatabase.class,GradeDatabase.dbName).allowMainThreadQueries().build().getGradeIDDAO();


        Intent intent = getIntent();
        final String whichClass = intent.getStringExtra("whichClass");
        gradeCategory = (GradeCategory) getIntent().getSerializableExtra("GradeCategory");
        ClassSelector.setText("Class: " + whichClass);

        user = (User) getIntent().getSerializableExtra("User");

        setText(whichClass);

        CalcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double score = 0;
                char grade = ' ';

                score += Double.parseDouble(Input1.getText().toString());
                score += Double.parseDouble(Input2.getText().toString());
                score += Double.parseDouble(Input3.getText().toString());
                score += Double.parseDouble(Input4.getText().toString());

                double percentage = score / 400;

                if(percentage >= 0.90) {
                    grade = 'A';
                } else if(percentage >= 0.8 && percentage < 0.9) {
                    grade = 'B';
                } else if (percentage >= 0.7 && percentage < 0.8) {
                    grade = 'C';
                } else if(percentage >= 0.6 && percentage < 0.7) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }

                gradeView.setText("Grade: " + grade);

                if(gradeIDDAO.getGrade(whichClass) != '\0') {
                    gradeIDDAO.update(whichClass, grade);
                } else {
                    gradeIDDAO.insert(new GradeCategory(whichClass, grade));
                }

            }
        });

    }


    void setText(String whichClass) {
        if(gradeIDDAO.getGrade(whichClass) != '\0') {
            gradeView.setText("Grade: " + gradeCategory.getGrade());
        } else {
            gradeView.setText("Grade: " + ' ');
        }
    }

    private void addToDataBase(String whichClass, char grade) {

//        int numOfTickets = Integer.parseInt(mTicketNum.getText().toString());
//        int prxiceOfTickets = Integer.parseInt(mTicketPrice.getText().toString());

//        int numOfTickets = Integer.parseInt(mTicketNum.getText().toString());
//        double priceOfTickets = Double.parseDouble(mTicketPrice.getText().toString());

        gradeIDDAO.insert(new GradeCategory(whichClass, grade));


//        mFlightLogDAO.insert(new FlightLog(departure, arrival, numOfTickets, priceOfTickets));

    }


}