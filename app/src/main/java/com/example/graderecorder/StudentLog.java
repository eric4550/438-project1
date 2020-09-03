package com.example.graderecorder;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.graderecorder.DB.StudentDatabase;

@Entity(tableName = StudentDatabase.STUDENTlOG_TABLE)

public class StudentLog {
    @PrimaryKey(autoGenerate = true)

    private int mStudentLogId;

}
