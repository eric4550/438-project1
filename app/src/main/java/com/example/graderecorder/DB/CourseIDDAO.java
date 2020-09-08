package com.example.graderecorder.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.graderecorder.CourseLog;

import java.util.List;

@Dao
public interface CourseIDDAO {

    @Insert
    void insert(CourseLog... courselogs);

    @Update
    void update(CourseLog... courselogs);

    @Delete
    void delete(CourseLog... courselogs);

    @Query("SELECT * FROM " + CourseDatabase.COURSELOG_TABLE + " ORDER BY Date DESC")
    List<CourseLog> getCourse();

    @Query("SELECT * FROM " + CourseDatabase.COURSELOG_TABLE + " WHERE mCourseID  = :courselog")
    CourseLog getQuestionWithId(int courselog);



}
