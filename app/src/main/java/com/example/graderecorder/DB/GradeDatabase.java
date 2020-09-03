package com.example.graderecorder.DB;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.graderecorder.DB.datetypeconverter.DateTypeConverter;
import com.example.graderecorder.GradeLog;


@Database(entities = {GradeLog.class}, version = 2)
@TypeConverters(DateTypeConverter.class)

public abstract class GradeDatabase extends RoomDatabase {

    public static final String dbName = "db-gradelog";

    public static final String GRADELOG_TABLE = "gradelog";

    public abstract GradeIDDAO getGradeLogDAO();
}
