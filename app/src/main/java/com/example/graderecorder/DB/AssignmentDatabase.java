package com.example.graderecorder.DB;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.graderecorder.AssignmentLog;
import com.example.graderecorder.DB.datetypeconverter.DateTypeConverter;


@Database(entities = {AssignmentLog.class}, version = 2)
@TypeConverters(DateTypeConverter.class)


public abstract class AssignmentDatabase extends RoomDatabase {


    public static final String dbName = "db-assignmentlog";

    public static final String ASSIGNMENTLOG_TABLE = "assignmentlog";

    public abstract AssignmentIDDAO getAssignmentIDDAO();
}
