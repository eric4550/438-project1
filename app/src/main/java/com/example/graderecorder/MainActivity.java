package com.example.graderecorder;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import com.example.graderecorder.DB.UserDAO;
import com.example.graderecorder.DB.UserDatabase;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "LifeCycleDemo";
    public static final String M1 = "Button State";


    TextView mainDisplay;

    EditText grade;
    EditText score;

    Button signIn;

    boolean m1 = true;


    /*** LOGIN ***/

    private EditText etUsername, etPassword;
    private Button btnLogin;
    private UserDAO db;
    private UserDatabase dataBase;
    private Button btnRegister;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnCreateAcct);

        dataBase = Room.databaseBuilder(this, UserDatabase.class,"User")
                .allowMainThreadQueries()
                .build();

        db = dataBase.getUserDao();

        btnRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                User user = db.getUser(username, password);

                if(user != null) {
                    Intent i = new Intent(MainActivity.this, HomeActivity.class);
                    i.putExtra("User", user);
                    startActivity(i);
                    finish();
                }else{
                    Toast.makeText(MainActivity.this, "incorrect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        Log.d(TAG, "onCreate(Bundle) called");
//
//        if(savedInstanceState != null){
//            m1 = savedInstanceState.getBoolean(M1, true);
//        }
//
//        mainDisplay = findViewById(R.id.mainDisplayID);
//
//        signIn = findViewById(R.id.btnLogin);
////        grade = findViewById(gradeID);
//
//        signIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                m1 = !m1;
//
//                openMainMenuActivity();
//
//            }
//        });
//
//
//    }
//
//    public void openMainMenuActivity(){
//
////        Intent intent = new Intent(this, MainMenu.class);
////        startActivity(intent);
//    }
//
//}
