package com.example.graderecorder;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.graderecorder.DB.GradeDatabase;

@Entity(tableName = GradeDatabase.GRADELOG_TABLE)

public class GradeLog {

    @PrimaryKey(autoGenerate = true)
    private int mGradeLogID;


}
