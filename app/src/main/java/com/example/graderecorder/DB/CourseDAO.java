package com.example.graderecorder.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.graderecorder.CourseLog;

import java.util.List;

@Dao
public interface CourseDAO {

    @Insert
    void insert(CourseLog... courseLogs);

    @Update
    void update(CourseLog... courseLogs);

    @Delete
    void delete(CourseLog... courseLogs);

    @Query("SELECT * FROM " + CourseDatabase.COURSELOG_TABLE + " ORDER BY Date DESC")
    List<CourseLog> getFlights();

    @Query("SELECT * FROM " + CourseDatabase.COURSELOG_TABLE + " WHERE mCourseID = :courseLogID")
    CourseLog getQuestionWithId(int courseLogID);
}
