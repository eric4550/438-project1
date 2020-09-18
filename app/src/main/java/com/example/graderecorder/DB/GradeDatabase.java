package com.example.graderecorder.DB;

import androidx.room.RoomDatabase;
import androidx.room.Database;

import com.example.graderecorder.GradeCategory;
import com.example.graderecorder.User;

@Database(entities = {GradeCategory.class}, version = 1, exportSchema = false)
public abstract class GradeDatabase extends RoomDatabase {


    public static final String dbName = "db-gradelog";

    public static final String GRADELOG_TABLE = "gradelog";

    public abstract GradeIDDAO getGradeIDDAO();
}
