package com.example.graderecorder;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView tvUser;
    private User user;

    Button course;
    Button assignments;
    Button returnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        user = (User) getIntent().getSerializableExtra("User");
        tvUser = findViewById(R.id.text);
//
//        if(user != null) {
//            tvUser.setText("Welcome ");
//        }

//        course = findViewById(R.id.coursesBtn);
//        assignments = findViewById(R.id.assignmentsBtn);
//        returnLogin = findViewById(R.id.btnLogin);
//
//
//        course.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                openCourse();
//            }
//        });
//
//        assignments.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                openAssignments();
//            }
//        });
//
//        returnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                returnToLogin();
//            }
//        });
//
//    }
//    public void openCourse(){
//        Intent intent = new Intent (this, RegisterActivity.class);
//        startActivity(intent);
//    }
//
//    public void openAssignments(){
//// Should go to assignment activity. Not main.
////        Intent intent = new Intent (this, AssignmentActivity.class);
//
//        Intent intent = new Intent (this, RegisterActivity.class);
//        startActivity(intent);
//    }
//
//    public void returnToLogin(){
//        Intent intent = new Intent (this, MainActivity.class);
//        startActivity(intent);
    }

}