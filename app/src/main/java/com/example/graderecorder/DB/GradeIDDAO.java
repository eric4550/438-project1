package com.example.graderecorder.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.graderecorder.GradeCategory;

import java.util.List;

@Dao
public interface GradeIDDAO {

    @Insert
    void insert(GradeCategory... gradecategories);

    @Update
    void update(GradeCategory... gradecategories);

    @Delete
    void delete(GradeCategory... gradecategories);

    @Query("Select * FROM " +  GradeDatabase.GRADELOG_TABLE + " WHERE title = :title")
    GradeCategory getGrade(String title);
//    @Query("SELECT * FROM " + GradeDatabase.GRADELOG_TABLE + " ORDER BY Date DESC")
 //   List<GradeCategory> getGrades();

    @Query("SELECT * FROM " + GradeDatabase.GRADELOG_TABLE + " WHERE categoryId = :gradeID")
    GradeCategory getQuestionWithId(int gradeID);
}
