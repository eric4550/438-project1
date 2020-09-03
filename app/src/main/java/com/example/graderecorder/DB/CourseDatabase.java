package com.example.graderecorder.DB;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.graderecorder.CourseLog;
import com.example.graderecorder.DB.datetypeconverter.DateTypeConverter;

@Database(entities =  {CourseLog.class}, version =  2)
@TypeConverters(DateTypeConverter.class)

public abstract class CourseDatabase extends RoomDatabase {
    public static final String dbName = "db-courselog";

    public static final String COURSELOG_TABLE = "courselog";

    public abstract CousreIDDAO getCourseLogDAO();
}
