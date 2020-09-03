package com.example.graderecorder;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = "LifeCycleDemo";
    public static final String M1 = "Button State";


    TextView mainDisplay;

    EditText grade;
    EditText score;

    Button signIn;

    boolean m1 = true;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate(Bundle) called");

        if(savedInstanceState != null){
            m1 = savedInstanceState.getBoolean(M1, true);
        }

        mainDisplay = findViewById(R.id.mainDisplayID);

        signIn = findViewById(R.id.btnLogin);
//        grade = findViewById(gradeID);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m1 = !m1;

                openMainMenuActivity();

            }
        });


    }

    public void openMainMenuActivity(){

//        Intent intent = new Intent(this, MainMenu.class);
//        startActivity(intent);
    }

}
