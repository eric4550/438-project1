package com.example.graderecorder;

import androidx.annotation.NonNull;
import androidx.room.PrimaryKey;

import java.io.Serializable;

public class Grade implements Serializable {

    @PrimaryKey(autoGenerate = true)
    @NonNull
    private int gradeId;
    private char grade;
    private int studentID;
    private int courseID;

    public Grade(char grade, int studentID, int courseID) {
        this.grade = grade;
        this.studentID = studentID;
        this.courseID = courseID;
    }

    @NonNull
    public int getGradeId() {
        return gradeId;
    }

    public void setGradeId(int gradeId) {
        this.gradeId = gradeId;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

}
