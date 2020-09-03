package com.example.graderecorder.DB;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.graderecorder.AssignmentLog;

import java.util.List;

@Dao
public interface AssignmentIDDAO {

    @Insert
    void insert(AssignmentLog... assignmentLogs);

    @Update
    void update(AssignmentLog... assignmentLogs);

    @Delete
    void delete(AssignmentLog... assignmentLogs);

    @Query("SELECT * FROM " + AssignmentDatabase.ASSIGNMENTLOG_TABLE + " ORDER BY Date Desc")
    List<AssignmentLog> getAssignments();

    @Query("SELECT * FROM " + AssignmentDatabase.ASSIGNMENTLOG_TABLE + " WHERE mAssignmentId = :assignmentLogID")
    AssignmentLog getQuestionWithId(int assignmentLogID);
}
