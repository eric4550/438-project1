package com.example.graderecorder.DB;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.graderecorder.DB.datetypeconverter.DateTypeConverter;
import com.example.graderecorder.StudentLog;

@Database(entities =  {StudentLog.class}, version =  2)
@TypeConverters(DateTypeConverter.class)

public abstract class StudentDatabase extends RoomDatabase {

    public static final String dbName = "db-studentlog";

    public static final String STUDENTlOG_TABLE = "studentlog";

    public abstract StudentIDDAO getStudentLogDAO();

}
