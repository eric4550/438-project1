package com.example.graderecorder;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;

public class AcctErrorMsg extends AppCompatDialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        AlertDialog.Builder builder = new AlertDialog.Builder((getActivity()));
        builder.setTitle("Error")
                .setMessage("Incorrect username or password")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
// .this would refer to the click event listner. getactivity() will get the job done
                        Intent intent = new Intent(getActivity(), MainActivity.class);
                        startActivity(intent);
                    }

                });
        return builder.create();
    }
}
