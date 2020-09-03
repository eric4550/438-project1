package com.example.graderecorder.DB;

import androidx.room.RoomDatabase;

public abstract class AssignmentDatabase extends RoomDatabase {

    public static final String dbName = "db-assignmentlog";

    public static final String ASSIGNMENTLOG_TABLE = "assignmentlog";

    public abstract AssignmentIDDAO getAssignmentIDDAO();
}
