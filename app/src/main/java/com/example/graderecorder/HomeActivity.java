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
<<<<<<< HEAD
    private Button course;
    private Button assignments;
    private Button returnLogin;
=======

    private Button course;
    private Button assignments;
    private Button returnLogin;

>>>>>>> 3aecd40672161d79fde730b733a457096be8b781
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
<<<<<<< HEAD
        course = findViewById(R.id.coursesBtn);
        assignments = findViewById(R.id.assignmentsBtn);
        returnLogin = findViewById(R.id.returnLoginBtn);
=======

        course = findViewById(R.id.coursesBtn);
        assignments = findViewById(R.id.assignmentsBtn);
        returnLogin = findViewById(R.id.returnLoginBtn);


>>>>>>> 3aecd40672161d79fde730b733a457096be8b781
        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCourse();
            }
        });
<<<<<<< HEAD
=======

>>>>>>> 3aecd40672161d79fde730b733a457096be8b781
        assignments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAssignments();
            }
        });
<<<<<<< HEAD
=======

>>>>>>> 3aecd40672161d79fde730b733a457096be8b781
        returnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToLogin();
            }
        });
<<<<<<< HEAD
    }
    public void openCourse(){
        Intent intent = new Intent ( HomeActivity.this, Courses.class);
        startActivity(intent);
    }
    public void openAssignments(){
// Should go to assignment activity. Not main.
//        Intent intent = new Intent (this, AssignmentActivity.class);
        Intent intent = new Intent (HomeActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
=======

    }
    public void openCourse(){
        Intent intent = new Intent ( HomeActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

    public void openAssignments(){
// Should go to assignment activity. Not main.
//        Intent intent = new Intent (this, AssignmentActivity.class);

        Intent intent = new Intent (HomeActivity.this, RegisterActivity.class);
        startActivity(intent);
    }

>>>>>>> 3aecd40672161d79fde730b733a457096be8b781
    public void returnToLogin(){
        Intent intent = new Intent (HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}