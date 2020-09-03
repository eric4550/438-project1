package com.example.graderecorder.DB;

import androidx.room.RoomDatabase;

public abstract class CourseDatabase extends RoomDatabase {

    public static final String dbName = "db-courselog";

    public static final String COURSELOG_TABLE = "courselog";

    public abstract AssignmentIDDAO getCourseIDDAO();

}
