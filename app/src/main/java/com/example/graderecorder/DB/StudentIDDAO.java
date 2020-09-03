package com.example.graderecorder.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.graderecorder.StudentLog;

import java.util.List;

@Dao
public interface StudentIDDAO {

    @Insert
    void insert(StudentLog... studentlogs);

    @Update
    void update(StudentLog...studentlogs);

    @Delete
    void delete(StudentLog... studentlogs);

    @Query("SELECT * FROM " + StudentDatabase.STUDENTlOG_TABLE + " ORDER BY Date DESC")
    List<StudentLog> getStudent();

    @Query("SELECT * FROM " + StudentDatabase.STUDENTlOG_TABLE + " WHERE mStudentLogId = :studentID")
    StudentLog getQuestionWithId(int studentID);
}
