package com.example.graderecorder;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.example.graderecorder.DB.CourseDatabase;

@Entity(tableName = CourseDatabase.COURSELOG_TABLE)


public class CourseLog {

    @PrimaryKey(autoGenerate = true)
    private int mCourseID;



}
