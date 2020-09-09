package com.example.graderecorder.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.graderecorder.User;

import java.util.List;

@Dao
public interface UserDAO {

    @Query("SELECT * FROM User WHERE username = :username and password = :password")
    User getUser(String username, String password);

    @Insert
    void insert(User user);

    //@Query("SELECT username from User WHERE ")
//    @Insert
//    void insert(User... user);
//
//    @Update
//    void update(User... users);
//
//    @Delete
//    void delete(User... users);
//
//
//
//    @Query("SELECT * FROM User WHERE username = :username and password = :password")
//    User getUser(String username, String password);


}
