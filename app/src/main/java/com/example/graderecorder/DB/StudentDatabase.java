package com.example.graderecorder.DB;

import androidx.room.RoomDatabase;

public abstract class StudentDatabase extends RoomDatabase {
    public static final String dbName = "db-studentlog";

    public static final String STUDENTLOG_TABLE = "studentlog";

    public abstract AssignmentIDDAO getStudentIDDAO();
}
