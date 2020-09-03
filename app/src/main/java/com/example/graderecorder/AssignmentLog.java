package com.example.graderecorder;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.graderecorder.DB.AssignmentDatabase;

@Entity(tableName = AssignmentDatabase.ASSIGNMENTLOG_TABLE)


public class AssignmentLog {

    @PrimaryKey(autoGenerate = true)
    private int mAssignmentID;


}
