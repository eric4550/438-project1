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

    private Button course;
//    private Button assignments;
    private Button returnLogin;



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

        course = findViewById(R.id.coursesBtn);
//        assignments = findViewById(R.id.assignmentsBtn);
        returnLogin = findViewById(R.id.returnLoginBtn);


        course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCourse();
            }
        });
        returnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnToLogin();
            }
        });
    }


    public void openCourse(){
        Intent intent = new Intent ( HomeActivity.this, Courses.class);
        intent.putExtra("User", user);
        startActivity(intent);
    }


    public void returnToLogin(){
        Intent intent = new Intent (HomeActivity.this, MainActivity.class);
        startActivity(intent);
    }
}