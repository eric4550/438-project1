package com.example.graderecorder.DB;

import androidx.room.RoomDatabase;

public abstract class GradeDatabase extends RoomDatabase {

    public static final String dbName = "db-gradelog";

    public static final String GRADELOG_TABLE = "gradelog";

    public abstract AssignmentIDDAO getGradeIDDAO();
}
