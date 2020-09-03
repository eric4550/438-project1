package com.example.graderecorder.DB;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.graderecorder.User;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM User WHERE username = :username and password = :password")
    User getUser(String username, String password);

    @Insert
    void insert(User user);

}
