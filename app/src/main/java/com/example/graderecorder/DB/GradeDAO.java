package com.example.graderecorder.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.graderecorder.GradeLog;

import java.util.List;

@Dao
public interface GradeIDDAO {
    @Insert
    void insert(GradeLog... gradelogs);

    @Update
    void update(GradeLog... gradelogs);

    @Delete
    void delete(GradeLog... gradelogs);

    @Query("SELECT * FROM " + GradeDatabase.GRADELOG_TABLE + " ORDER BY Date DESC ")
    List<GradeLog> getGrades();

    @Query("SELECT * FROM " + GradeDatabase.GRADELOG_TABLE + " WHERE mGradeLogID = :gradeLogID")
    GradeLog getQuestionWithId(int gradeLogID);
}
