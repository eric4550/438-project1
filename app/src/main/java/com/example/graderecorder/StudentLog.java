package com.example.graderecorder;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.graderecorder.DB.StudentDatabase;

@Entity(tableName = StudentDatabase.STUDENTLOG_TABLE)

public class StudentLog {
    public int mStudentLogId;

    public StudentLog(int mStudentLogId) {
        this.mStudentLogId = mStudentLogId;
    }
}
