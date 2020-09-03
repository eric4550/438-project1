package com.example.graderecorder.DB;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.graderecorder.User;

@Database(entities = (User.class), version = 1, exportSchema = false)
public abstract class UserDatabase extends RoomDatabase {

    public abstract UserDAO getUserDao();


}
