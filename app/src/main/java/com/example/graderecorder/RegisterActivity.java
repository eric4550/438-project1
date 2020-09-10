package com.example.graderecorder;

import android.content.Intent;
import android.os.Bundle;

import com.example.graderecorder.DB.UserDAO;
import com.example.graderecorder.DB.UserDatabase;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.room.Room;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText etUsername, etPassword, etCnfPassword, etFirst, etLast;
    Button btnRegister, btnLogin;
    TextView tvLogin;
    private UserDAO userDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etUsername = findViewById(R.id.etUsername);
        etFirst = findViewById(R.id.etFirst);
        etLast = findViewById(R.id.etLast);
        etPassword = findViewById(R.id.etPassword);
        etCnfPassword = findViewById(R.id.etCnfPassword);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RegisterActivity.this, MainActivity.class));
            }
        });

        userDAO = Room.databaseBuilder(this, UserDatabase.class,"User").build().getUserDao();

        btnRegister = findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString().trim();
                String cnfPassword = etCnfPassword.getText().toString().trim();
                String first = etFirst.getText().toString().trim();
                String last = etLast.getText().toString().trim();

                if(password.equals(cnfPassword)){
                    User user = new User(username, password, first, last);
                    userDAO.insert(user);
                    Intent toLogin = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(toLogin);
                }else{
                    Toast.makeText(RegisterActivity.this, "passwords do not match", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}